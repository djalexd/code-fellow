
function performSearch(query) {
    $.ajax({
        type: "GET",
        url: "api/search",
        processData: false,
        data: "query=" + query,
        dataType: "json",
        success: function(data, status, xhr) {
            // dispatch
            getTemplateAjax('templates/github.handlebars', function(template) {
                $("#githubSearchResults").html(template({"results" : data}));
            });
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
