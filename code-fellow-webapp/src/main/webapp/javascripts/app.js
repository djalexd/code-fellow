
function performSearch(query) {
    $.ajax({
        type: "GET",
        url: "api/search",
        processData: false,
        data: "query=" + query,
        dataType: "json",
        success: function(data, status, xhr) {

            if (data.github) {
                // dispatch
                getTemplateAjax('templates/github.handlebars', function(template) {
                    $("#githubSearchResults").html(template(data.github));
                });
            }

            if (data.stackoverflow) {
                // dispatch
                getTemplateAjax('templates/stackoverflow.handlebars', function(template) {
                    $("#stackoverflowSearchResults").html(template(data.stackoverflow));
                });
            }


            if (data.mavenCentral) {
                // dispatch
                getTemplateAjax('templates/mavenCentral.handlebars', function(template) {
                    $("#mavenSearchResults").html(template(data.mavenCentral));
                });
            }
        }
    });
}

$(document).ready(function() {
    $("#searchButton").click(function(evt) {
        performSearch($("#searchText").val());
    });
});


function getTemplateAjax(path, callback) {

   $.ajax({
        url: path,
        timeout: 1000,
        datatype: "text/javascript",
        success: function(response, textStatus, jqXHR) {
            var template = Handlebars.compile(jqXHR.responseText);
            //execute the callback if passed
            if (callback) callback(template);
        }
   });
}
