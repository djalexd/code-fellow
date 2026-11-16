# Red Team — adversarial validation of the merged shortlist (16 Nov 2026)

*Role: Red Team / Market Validator. Job: try to kill each shortlisted idea with evidence. Semrush for keyword data; marathonballot.com, racenotify.com, klaruna.eu and revistabiz.ro were blocked, so snippets were used there.*

**Bottom line:** three ideas fail outright (Hyrox, e-invoice API, pay transparency). Pacing packs survive only as a free feature. P1, P2 and P4 are EuroSlam features, not separate businesses. Two key claims were wrong: P1's "no European equivalent" (a competitor sells the same alerts at the same €19/yr) and S1's €290–990 price (a competitor lists $49/mo).

## Verdict table

| # | Idea | Verdict | Demand | Fit | Defens. | Passive / Venture |
|---|---|---|---|---|---|---|
| P1 | Race Radar alerts | **KEEP WITH CHANGES**: build into EuroSlam; no standalone €19 Pro | 6 | 9 | 2 | 6 |
| P2 | Multilingual calendars | **KEEP WITH CHANGES**: translated race pages, long-tail only | 5 | 8 | 3 | 8 |
| P3 | Hyrox calendar + percentiles | **KILL** | 7 | 3 | 1 | 6 |
| P4 | Pacing packs + PB-weather index | **KILL** paid; keep index as free EuroSlam feature | 2 | 8 | 2 | 7 |
| P5 | Forge app replacing a DC-only app | **KEEP WITH CHANGES**: only once a target app is named | 5? | 6 | 5 | 5 |
| P6 | EU e-invoice API + MCP | **KILL** | 6 | 7 | 1 | 6 |
| S1 | CRA Desk | **KEEP WITH CHANGES**: hardware/IoT SMEs, lower price | 7 | 5 | 4 | 6 |
| S2 | RO/CEE AI bid desk | **KEEP WITH CHANGES**: sell to bid consultants; drafting is the wedge | 6 | 7 | 4 | 7 |
| S3 | RO accounting-firm autopilot | **KEEP** (strongest startup) | 7 | 9 | 5 | 6 |
| S3' | Pay transparency kit | **KILL** | 3 | 5 | 2 | 4 |

## Evidence by idea

**P1 Race Radar.** "No European equivalent": **CONTRADICTED.** Competitors: marathonballot.com "Radar" $19/yr (Majors) ([marathonballot](https://www.marathonballot.com/radar)); RaceNotify monitors thousands of European races, paid priority alerts, 3,022 alerts sent ([racenotify](https://racenotify.com/en/just-opened)); marathon-index.com registration/sell-out alerts ([marathon-index](https://marathon-index.com/races/mont-blanc-marathon/registration/)). Demand **VERIFIED**: "london marathon ballot" 12,100/mo UK; Copenhagen Marathon 80,937 applicants for ~35k places, Copenhagen Half 188,522 for 45k ([Copenhagen](https://copenhagenmarathon.dk/en/massive-interest-in-copenhagen-marathon-more-than-80000-runners-apply-for-an-entry/), [MH](https://marathonhandbook.com/copenhagen-half-marathon-2027-lottery-entries/)). Change: free alerts inside EuroSlam covering non-Major lotteries; monetise via guaranteed-entry tours, charity places, hotels ([Marathon Tours](https://marathontours.com/en-gb/world-marathon-majors/packages-with-guaranteed-entry)). Test: "notify me" on 30 race pages + fake-door Pro; pass ≥300 signups and ≥2% Pro clicks in 14 days.

**P2 Multilingual.** Volumes **VERIFIED** (laufkalender 1,600 KD30; carreras populares 2,900 KD31; calendrier course a pied 590 KD14). Federation SERPs **PARTLY VERIFIED** (runnersworld.de #1, then BLV, HLV, leichtathletik.de). AIO rarity **UNVERIFIABLE**. Killer issue: head terms want local 5K/10K; already served by ahotu, finishers, marathons.com, hdsports, marathon-index ([ahotu](https://www.ahotu.com/de/kalender/laufen/marathon), [hdsports](https://www.hdsports.org/running/maraton-espana)). Change: long-tail "[race] 2027 date/weather/registration" pages. Test: 40 German pages; pass ≥1,500 GSC impressions in 4 weeks.

**P3 Hyrox — KILL.** Participants VERIFIED >1.5M ([BoxRox](https://www.boxrox.com/hyrox-expands-global-2026-27-season-to-2-million-athletes-and-107-races/)); "hyrox events" KD67, hyrox.com holds 4 top spots, roxradar.com free calendar + alerts ([roxradar](https://www.roxradar.com/news/welcome-to-roxradar-never-miss-another-start-line)); percentile calculators saturated (hyroxdatalab, rox-coach, hyranking, fitnessvolt, roxlyfe) ([hyroxdatalab](https://hyroxdatalab.com/articles/what-is-a-good-hyrox-time)); "hyrox calculator" 90/mo.

**P4 Pacing packs — KILL paid.** racecast.io has 20+ yrs race-day weather, RunScore, weather-adjusted splits, fuelling, alerts ([racecast](https://racecast.io/blog/berlin-marathon-weather-history)); FindMyMarathon PR Score ([findmymarathon](https://findmymarathon.com/fastestmarathons.php?page=5)); demand ~0 ("london marathon pacing strategy" 10/mo).

**P5 Forge.** DC EOL 28 Mar 2029 **VERIFIED**; new DC app submissions stopped 16 Dec 2025, new DC sales 30 Mar 2026 ([Atlassian](https://www.atlassian.com/licensing/data-center-end-of-life)). 0% on first $1M **VERIFIED with caveats** (per partner, Forge-only, usage above free tier billed) ([Atlassian](https://www.atlassian.com/blog/developers/updates-to-marketplace-revenue-share-2026)). Gap app **UNVERIFIABLE**. Test (5 days): Marketplace API → ≥3 DC-only apps with 1,000+ installs whose best Cloud alternative has <100 installs + ≥5 community threads.

**P6 e-invoice API — KILL.** InvoiceXML hosted MCP incl. KSeF FA(3) ([mcpservers](https://mcpservers.org/servers/www-invoicexml-com-mcp-server)); thelawin.dev, ConvertAPI, B2Brouter; Invopop self-serve ([Invopop](https://www.invopop.com/blog/new-pricing-2026)); e-invoice.be ~€0.25/invoice; Storecove; OSS mcp-einvoicing-de, mcp-ksef-pl ([PyPI](https://pypi.org/project/mcp-einvoicing-de)); 8+ Shopify apps ([Shopify](https://apps.shopify.com/invonorm)); free Woo plugin.

**S1 CRA Desk.** SRP live 11 Sep 2026 **VERIFIED** ([ENISA](https://www.enisa.europa.eu/news/the-cra-single-reporting-platform-is-launched)). Price **CONTRADICTED**: CRA-Ready $49/mo ([Capterra](https://www.capterra.com/p/10045966/CRA-Ready/)); Verimu free until 1 Sep 2026; CRACI €1.4M ([tamradar](https://www.tamradar.com/funding-rounds/craci-pre-seed-1-4m)); ONEKEY "CRA Fast Start" ([ONEKEY](https://www.onekey.com/press-release/onekey-launches-cra-fast-start-to-help-manufacturers-prepare-for-eu-cyber-resilience-act)); Anchore, Sonatype, Mend, Cloudsmith add CRA features. Reporting applies only to actively exploited vulns (rare); real budget moment 11 Dec 2027; SMEs struggle most with documentation/conformity ([Martel](https://martel-innovate.com/?p=363037)). Change: CEE embedded/IoT/hardware SMEs; Annex VII file + firmware SBOM + runbook at €99–299/product. Test: 30 conversations → ≥3 paid pilots/LOIs at €99+/mo.

**S2 Bid desk.** Minerva >$2.5M ARR **VERIFIED** ([WBJ](https://wbj.pl/ai-targets-tenders/post/149513)). Missed competitors: Tendios (Romania page, €2M, proposal generation) ([Tendios](https://public.tendios.com/countries/romania)); TenderingOS (Neo Vision, Feb 2026); Mimira. Local: licitatia.ro AI search, DataDriven.ro monitoring, sicap.ai free ([wall-street.ro](https://www.wall-street.ro/articol/ai/licitatiaro-combina-cautarea-clasica-si-inteligenta-artificiala)) — none show drafting. Warning: 44% of RO tenders single-bidder vs EU 28% ([EU scoreboard](https://single-market-scoreboard.ec.europa.eu/node/612_ro)). Test: free requirements matrix + DUAE checklist to 10 bid consultants → ≥4 use on real bid, 2 pay €150.

**S3 Accounting autopilot — KEEP.** Saga/WinMentor import from SPV per company ([contabilul.ro](https://contabilul.manager.ro/a/28504/saga-ce-pasi-trebuie-sa-urmati-pentru-generare-si-transmitere-e-facturi.html)); ContApp, Keez, SmartBill/Oblio exports; Declaro; QuickFin.erp sells to companies, not firms ([ZF/Orange](https://www.orange.ro/info/news/zf/article/antreprenorul-david-aron-ceo-alpin-group-intra/3001724)). No multi-client cockpit for firms found. Firm counts/WTP unverifiable — check CECCAR register. Test: 15 interviews + concierge pilot for 3 firms → 2 prepay ≥€4/client/month.

**S3' Pay transparency — KILL.** Romanian Senate rejected L445/2026 on 14 Oct 2026 ([Trusaic](https://trusaic.com/blog/euptd-october-roundup-updates-from-greece-romania-germany-and-poland/), [DLA](https://knowledge.dlapiper.com/dlapiperknowledge/globalemploymentlatestdevelopments/2026/romania-draft-law-implementing-the-gender-pay-transparency-directive-currently-before-parliament)); AROBS UCMS, PwC RO, Lecora, Trusaic, figures.hr, GenderGov already present ([startupcafe](https://startupcafe.ro/o-firma-it-romaneasca-a-lansat-un-soft-de-conformare-a-firmelor-la-directiva-ue-privind-transparenta-salariala-100990)).

## Replacements proposed
- **R1 — SPV multi-company e-Factura inbox for accountants** (€15–30/accountant/month; S3's entry point). SPV works per company; bulk needs ANAF developer API OAuth ([folositor](https://folositor.ro/ghid/descarcare-facturi-efactura)). Test: landing page + RO accountant Facebook groups → 50 waitlist in 14 days.
- **R2 — CRA scope checker + incident-report templates** (free tool + €49 pack; lead source for S1). ONEKEY: two-thirds unprepared ([ONEKEY](https://www.onekey.com/press-release/onekey-study-businesses-still-have-significant-ground-to-cover-on-cyber-resilience-act-readiness)). Test: 100 checks + 5 pack sales in 14 days.

## Overlap
P1/P2/P4 cannibalise EuroSlam traffic → build as modules. P3 off-brand. P6 ∩ S3 on RO e-Factura XML; S3 has the reachable buyer. S1 ∩ R2 share a funnel. klaruna.eu unknown — check vs S3/R1 if fintech/invoicing.
