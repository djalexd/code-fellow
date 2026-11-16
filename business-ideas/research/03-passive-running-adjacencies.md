# Scout #3 — Adjacencies to EuroSlam's running & race-travel assets

*Role: Passive-Income Scout #3. Lane: ideas that reuse euroslam.run / therunningcat.blog data, code, domain knowledge and audience. Researched Nov 2026. Revenue figures are estimates unless sourced.*

## 1. Market size: demand is growing, and Europe's growth is in half marathons and ballots

- **Ballot demand keeps setting records.** London 2026 ballot: 1,133,813 applicants, +36% YoY ([LME](https://www.londonmarathonevents.co.uk/london-marathon/article/new-ballot-world-record-2026-tcs-london-marathon)). 2027 double-event ballot: 1,338,544 ([Athletics Weekly](https://athleticsweekly.com/news/over-1-3-million-people-apply-for-next-years-london-marathon-1040011115/)). Dublin 2026: record 47,000 ballot applications ([Irish Times](https://www.irishtimes.com/sport/athletics/2025/11/27/dublin-marathon-record-47000-applications-for-lottery-based-ballot-for-2026-event/)). SuperHalfs is moving to ballots because demand is "much higher than the number of available spots" ([SuperHalfs](https://superhalfs.realbuzz.com/en/articles/news/2025/06/26/ballots-vs-first-come-first-served/), [endurance.biz](https://endurance.biz/2026/industry-news/driven-by-running-boom-superhalfs-series-shifts-to-ballot-era/)).
- **Gen Z is racing more.** Strava Year in Sport 2025: Gen Z half-marathon entries +31%, marathons +33%; run clubs grew 3.5x on the platform ([SGB](https://sgbonline.com/stravas-year-in-sport-trend-report-highlights-gen-zs-passion-for-run/), [Athletech](https://athletechnews.com/running-walking-strength-training-strava-year-in-sport-report/)). UK mass participation grew 7.8% in 2025 ([Eventrac](https://eventrac.co.uk/blog/3417-the-mass-participation-report-2025)).
- **Race tourism is real money.** Valencia marathon + half 2025: €59M tourist spend; 65.5% of marathon runners foreign; €197/day ([officialpress](https://officialpress.es/el-maraton-y-medio-maraton-de-valencia-bate-records-economicos/)).
- **Hyrox:** ~175k athletes (2023/24) → 650k+ (2024/25) → 1.3–1.5M (2025/26), 100+ race weekends ([BarBend](https://barbend.com/news/hyrox-exceeds-100-calendar-events/), [Boxlife](https://boxlifemagazine.com/hyrox-surpasses-crossfit-sets-olympic-sights/)); targeting 2M+ in 2026/27 ([endurance.biz](https://endurance.biz/2026/industry-news/targeting-2-million-athletes-hyrox-expands-global-calendar-for-2026-27-season/)).

## 2. Monetisation benchmarks

| Channel | Rate | Source |
|---|---|---|
| Booking.com | Direct programme closed June 2025; now via network (CJ / Awin). 25–40% of Booking's commission; session-only cookie | [MakeInfluence](https://www.makeinfluence.com/en/academy/booking-coms-affiliate-program-how-travel-creators-earn-commission), [Track360](https://track360.io/blog/booking-com-affiliate-partner-program-operator-teardown-2026) |
| Stay22 | 30% rev share default; bloggers report ~$7–11/booking, ~4.6% click→booking | [Bel Around the World](https://www.belaroundtheworld.com/stay22-review/), [Explorer Tom](https://explorertom.com/en/stay22-review/), [Helena Bradbury](https://helenabradbury.com/blog-1/stay22-review-blogger-commission-stats) |
| GetYourGuide | 7–8%, 30-day cookie | [Lasso](https://getlasso.co/affiliate/get-your-guide/) |
| eSIM (Airalo/Holafly) | ~10%; useful only for non-EU visitors (EU roaming is free) | [Holafly](https://esim.holafly.com/affiliate-program/), [MCANISM](https://campaigns.mcanism.com/airalo-the-worlds-first-esim-store) |
| Amazon.de Sport | ~3% (undated source) | [Winfuture](https://winfuture.de/news,115285.html) |
| Race-entry affiliates | RunSignup 15% of its processing fee (US-heavy); Let's Do This no public programme; Ahotu (WSG) rates private | [RunSignup](https://runsignup.com/Affiliate), [Ahotu T&C](https://help.ahotu.com/article/79-ahotu-affiliate-program-terms-and-conditions) |
| Charging organisers | Find a Race: 15% + VAT per entry sold | [Find a Race](https://help.findarace.com/article/50-commission-fees-funds-overview) |
| Newsletter sponsorship | beehiiv ad network from ~$5 CPM; <50k lists $300–5k/send | [beehiiv](https://www.beehiiv.com/blog/newsletter-sponsorship-cost), [newsletrix](https://cf-newsletrix.pages.dev/blog/newsletter-sponsorship-pricing-guide) |
| Tour operators | Marathon Tours: 3-night Berlin $1,195 + $435 guaranteed entry | [Marathon Tours](https://marathontours.com/en-us/events/berlin-marathon/) |
| Training apps | Runna $119.99/yr; Strava+Runna bundle $149.99/yr | [Tom's Guide](https://www.tomsguide.com/wellness/fitness/strava-and-runna-launch-joint-subscription-heres-what-you-need-to-know) |

**Estimated value of a hotel click:** ~4.6% × ~$9 ≈ **$0.40**. Hotel affiliate income scales only with traffic.

## 3. Platform and legal limits

- **Strava API:** data may be shown only to the owning user; AI/ML training banned ([road.cc](https://road.cc/content/news/strava-users-cant-publicly-share-data-third-party-apps-311329), [the5krunner](https://the5krunner.com/2024/11/20/strava-issues-clarification/)); June 2026 crackdown report ([TechRepublic](https://www.techrepublic.com/article/news-strava-api-scraping-crackdown/), unverified against Strava). New apps capped at 1 athlete, self-upgrade to 10, beyond needs slow review ([Strava docs](https://developers.strava.com/docs/rate-limits/)). → Don't build leaderboards on Strava.
- **Bib transfers** are controlled by races (Copenhagen official resale DKK 160 and no above-face-value; Marseille-Cassis via Swika €9; Finishers official resale in France) ([World Athletics](https://worldathletics.org/competitions/world-athletics-road-running-championships/copenhagen26/the-event/resale-platform), [Marseille-Cassis](https://www.marseille-cassis.com/en/vente-achat-dossards), [SGI](https://www.sgieurope.com/running/finishers-launches-official-race-bib-resale-in-france/123349.article)). → No P2P bib marketplace; pointing to official windows is fine.
- **Garmin Connect IQ:** $100/yr + ~15% of sales; devs report near-zero purchases ([the5krunner](https://the5krunner.com/2024/08/07/garmin-connect-iq-store-allows-paid-for-apps-using-garmin-pay/), [forum](https://forums.garmin.com/developer/connect-iq/f/showcase/430838/i-monetized-my-ski-app-here-s-what-happened)). → Free marketing channel only.

## 4. Candidate ideas

### A. Ballot & sold-out alerts (email list + paid tier) — strongly reinforces EuroSlam
Alerts for ~285 races: ballot open/close, entry open, price-tier rises, sell-outs, official resale windows. Demand: London/Dublin ballot records, SuperHalfs ballots, HYTRACK sells paid Hyrox ticket alerts ([prommer](https://prommer.net/en/training/hyrox/tickets/)); Rundida does this for the US ([rundida](https://rundida.com/marathon/entry-calendar/)); no European equivalent found. Free weekly email; Pro €19/yr; sponsors €100–300/send; hotel links ("Ballot won? Book now"). Build 5–7 days; ~2h/week. Month 12 estimate €200–600/mo (3,000 subs, 2% Pro, 2 sponsored sends). Risk: date accuracy on 285 sites.

### B. Race-weather "PB potential" data layer — strongly reinforces
Historical race-day weather score per race; "odds Valencia Half is under 12°C"; embeddable widget; paid CSV/API. Temperature is the main weather factor, optimum ~8–12°C ([PMC](https://pmc.ncbi.nlm.nih.gov/articles/PMC8293098), [World Athletics](https://worldathletics.org/waendurancemedicine/news/an-investigation-on-world-majors-marathons-running-performance-analysis-of-elite-runners)). Possible competitor racecast.io (not verifiable from sandbox). Build 4–6 days; ~1h/week. Month 12 estimate €100–400/mo direct + traffic for A and C.

### C. Race-specific pacing & plan packs — reinforces
€12–19 per race: 10-week plan, course-adjusted pace band, heat-adjusted targets, .FIT/ICS export. Sell via Lemon Squeezy (handles EU VAT). Build 6–8 days; ~1h/week. Month 12 estimate €150–600/mo (15–40 sales/mo).

### D. Hyrox / trail passport clone — competes for focus
Fork the engine. Build 7–10 days; 2h/week; €100–500/mo estimate. Trademark & single-organiser risk. Defer.

### E. Featured listings for small CEE organisers — not passive initially
€99–249/yr; useful only once traffic >~20k visits/mo.

**Rejected:** P2P bib marketplace (legal/ToS), paid Garmin apps (weak sales), Strava-based leaderboard (API terms), standalone eSIM/insurance sites.

**Quick win:** move hotel links to Stay22 (30% share, no tier threshold); add GetYourGuide (8%) on packing/budget pages.

## 5. Top 3
1. **A — Ballot & sold-out alerts**
2. **B — Race-weather PB-potential data**
3. **C — Race-specific pacing packs**
