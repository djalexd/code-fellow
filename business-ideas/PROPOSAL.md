# New Business Ideas: 6 Passive + 3 Startup (Proposal, Nov 2026)

**For:** the founder of euroslam.run (hobby / passive) and klaruna.eu (startup)
**Prepared:** 16 Nov 2026, by a 7-agent research team, merged and edited by the lead
**Read time:** about 15 minutes. Sourced evidence is in [`research/`](research/).

---

## 0. TL;DR

| # | Idea | Type | Build | Ongoing | Month-12 revenue (est.) | Conviction |
|---|---|---|---|---|---|---|
| **P1** | **Race Radar**: European ballot, entry-opening and sell-out alerts plus an auto-written newsletter, inside EuroSlam | Passive, flywheel | 5–7 days | ~2 h/wk | €100–500/mo + list growth | High |
| **P2** | **EuroSlam in 5 languages**: long-tail race pages (DE/FR/ES/IT/NL) with a free weather "PB index" | Passive, flywheel | 7–10 days | ~2 h/wk | €200–1,000/mo | Medium-High |
| **P3** | **EuroSlam inside AI assistants**: MCP server, Claude connector and ChatGPT app | Passive, option bet | 3–5 days | <1 h/wk | €0–300/mo | Low (cheap) |
| **P4** | **e-Factura multi-company inbox for Romanian accountants** (SPV → Saga/WinMentor) | Passive micro-SaaS, wedge for S1 | 10–15 days | 2–3 h/wk | €500–2,000/mo | High |
| **P5** | **CRA scope checker + incident-report template pack** | Passive tool + digital product, wedge for S3 | 5–7 days | ~1 h/wk | €200–1,000/mo | Medium |
| **P6** | **Atlassian Forge app replacing a Data-Center-only app** (gated by a 5-day screen) | Passive marketplace app | 10–20 days | 2–4 h/wk | $800–2,000/mo | Medium (conditional) |
| **S1** | **AI back office for Romanian accounting firms** (start with P4) | Startup | MVP 6–8 wks | full-time | path to €1M ARR ≈ 60 firms × €1.4k/mo | **Strongest** |
| **S2** | **AI bid desk for Romanian/CEE public tenders** (drafting, not monitoring) | Startup | MVP 4–6 wks | full-time | path to €1M ARR ≈ 280 × €300/mo | Strong |
| **S3** | **Cyber Resilience Act compliance for CEE hardware/IoT SMEs** (start with P5) | Startup | MVP 4–8 wks | full-time | Dec 2027 deadline drives buying | Medium |

All revenue figures are **estimates** with stated assumptions. None of these is a forecast you should bank on.

**The core recommendation:**
1. **Passive:** spend the next 6 weeks on P1 → P2. The Nov–Jan spring-race planning window is open now. Every other passive bet gets cheaper once EuroSlam has an email list and translated pages.
2. **Startups:** the two Romanian-language ideas (S1, S2) have the best founder-market fit in the whole study. US and Western-European AI startups are funded heavily but skip RO/BG/HU/SK. Run the 2-week validation tests for both, then commit to the one that passes. Before you do, check that neither overlaps with Klaruna (see §6).
3. **Several ideas we researched and killed** (Hyrox, an e-invoice API, pay transparency, paid pacing plans) are listed in §5 with reasons, so you don't re-spend time on them.

---

## 1. How this was produced (the team)

| Agent | Role | Output |
|---|---|---|
| Context Analyst | Profile the founder's existing assets. The live sites were blocked from the sandbox, so I used the EuroSlam business context from your marketing skill: ~285 races, 41 countries, hotel affiliates, a few dozen users, English only. | founder profile |
| Passive Scout 1 | Content, data and programmatic-SEO assets. Ran live Semrush keyword pulls. | [`research/01`](research/01-passive-pseo-data.md) |
| Passive Scout 2 | Micro-SaaS, app stores, extensions, APIs, AI-agent stores | [`research/02`](research/02-passive-microsaas-appstores.md) |
| Passive Scout 3 | Adjacencies to EuroSlam's data, code and audience | [`research/03`](research/03-passive-running-adjacencies.md) |
| Startup Scout 1 | EU regulatory deadlines that force spending, checked as of Nov 2026 | [`research/04`](research/04-startup-eu-regulation.md) |
| Startup Scout 2 | Investor theses (YC, Sequoia, a16z, Atomico, Bessemer) and AI-native shifts | [`research/05`](research/05-startup-vc-theses-ai.md) |
| Red Team | Tried to kill every shortlisted idea: missed competitors, claim checks, validation tests | [`research/06`](research/06-red-team.md) |
| Lead (me) | Briefs, merging, de-duplication, final ranking, this document | this file |

The process: the scouts researched in parallel and returned 22 candidates. I merged and de-duplicated them into a 10-item shortlist. The red team killed 4 items and proposed 2 replacements. The final list is 6 passive and 3 startup ideas.

**Limits.** euroslam.run, klaruna.eu and several competitor sites were blocked by the sandbox network, so some points rest on search snippets. **What Klaruna does is unknown to this team.**

---

## 2. Five market facts that shaped every choice

1. **Google traffic to "articles" is collapsing; traffic to "events, dates and bookings" much less so.**
   - AI Overviews cut top-result click-through by 34.5% (Apr 2025), then 58% (Dec 2025) ([Ahrefs via SEL](https://searchengineland.com/google-ai-overviews-drive-drop-organic-paid-ctr-464212)).
   - Overviews trigger on 21.4% of informational queries but only 2.1% of transactional and 0.9% of navigational ones ([Ahrefs](https://ahrefs.com/blog/ai-overview-triggers/)).
   - Content-site sale multiples fell ([Empire Flippers](https://empireflippers.com/you-can-sell-your-business-for-life-changing-money-in-2025-heres-the-secret/)).
   - **Implication:** dated, data-rich race pages and tools are fine. "How to train for a half" content is not. Owning an email list is the hedge against the next Google update.
2. **App stores are flooded because AI made cloning cheap.**
   - Shopify saw 2,861 new apps in May 2026, and 80% of new apps have zero reviews ([taylorsicard](https://taylorsicard.com/blog/shopify-app-store-statistics-2026)).
   - I counted about 17 German e-Rechnung apps on Shopify alone.
   - **Implication:** "build fast" is no longer a moat. Proprietary data, a local language, national-system integrations or a deadline the market hasn't caught up to are.
3. **Runner platforms are closed to third parties.**
   - Since 2024 Strava lets apps show a user's data only to that user, banned AI use of its data, made developer access paid from June 2026, and removed club endpoints in Sep 2026 ([DC Rainmaker](https://dcrainmaker.com/2024/11/stravas-changes-to-kill-off-apps.html), [Notebookcheck](https://www.notebookcheck.net/Strava-just-pulled-a-Reddit-on-its-developer-community.1312468.0.html)).
   - Paid Garmin Connect IQ apps report near-zero sales ([Garmin forum](https://forums.garmin.com/developer/connect-iq/f/showcase/430838/i-monetized-my-ski-app-here-s-what-happened/2013903)).
   - **Implication:** build on your own race data, not on their APIs.
4. **Investors now fund "selling the work" rather than "selling the tool," and they are doing it in the West.**
   - Sequoia's "Services: The New Software" (Mar 2026) estimates about $6 of services spend for every $1 of software spend ([Sequoia](https://sequoiacap.com/article/services-the-new-software)).
   - Funded AI accounting, legal, freight and property startups (Sumary, Integral, LimeTax, Theo, Lette) target DACH, the UK, France, Italy and the Nordics ([Sifted](https://sifted.eu/articles/why-europes-ai-founders-are-opening-accounting-and-law-firms/)).
   - **Implication:** Romanian-language back-office work is a gap that a Romanian developer is unusually well placed to fill.
5. **The Omnibus packages and delays reshuffled EU-regulation opportunities.**
   - **Dead:** CSRD/CSDDD (about 50k → 5k firms in scope), the CBAM long tail, and AI Act high-risk tooling (moved to Dec 2027 / Aug 2028).
   - **Alive and dated:** Cyber Resilience Act reporting (live since 11 Sep 2026, full obligations 11 Dec 2027) and the 2027 wave of national e-invoicing mandates.
   - Sources: [research/04](research/04-startup-eu-regulation.md).

---

## 3. Passive income ideas (6)

> "Passive" here means: buildable in ≤3 weeks with your speed, then **<5 h/week**. P1–P3 are one traffic engine (EuroSlam). P4–P6 diversify away from running so the portfolio doesn't depend on a single Google ranking.

### P1. Race Radar: European ballot and entry alerts, inside EuroSlam ⭐ do first

**What.** EuroSlam already tracks dates and sold-out status. Turn that into:
- per-race "notify me" alerts: ballot opens or closes, entry opens, a price tier rises, a race sells out, an official resale window opens
- a weekly auto-generated "Race Radar" email: what opened this week, what closes soon, what just sold out

**Why now.**
- Demand for ballots keeps setting records:
  - London 2026: 1.13M applicants ([LME](https://www.londonmarathonevents.co.uk/london-marathon/article/new-ballot-world-record-2026-tcs-london-marathon))
  - Copenhagen Half: 188,522 applicants for 45k places ([Marathon Handbook](https://marathonhandbook.com/copenhagen-half-marathon-2027-lottery-entries/))
  - SuperHalfs is moving to ballots ([endurance.biz](https://endurance.biz/2026/industry-news/driven-by-running-boom-superhalfs-series-shifts-to-ballot-era/))
  - Gen Z half-marathon entries rose 31% ([Strava via SGB](https://sgbonline.com/stravas-year-in-sport-trend-report-highlights-gen-zs-passion-for-run/))
- Nov–Jan is EuroSlam's biggest planning window.

**Red-team correction.** This is *not* a blank space. marathonballot.com sells "Radar" alerts at $19/yr (mostly the Majors), RaceNotify monitors European races, and marathon-index has alerts ([research/06](research/06-red-team.md)). So:
- **Don't sell a €19 Pro tier.** Make alerts free and use them to grow EuroSlam's list.
- Cover the **non-Major European lotteries and sell-outs** that the Majors-focused tools ignore (Copenhagen, Prague, Valencia, Paris, the SuperHalfs, Riga, Warsaw…).

**Money (est.).**
- Newsletter sponsorships: $50–250 per placement under 5k subscribers ([beehiiv](https://www.beehiiv.com/blog/newsletter-sponsorship-cost)).
- "Ballot won? Book your hotel" affiliate clicks.
- Affiliate links to guaranteed-entry tour and charity-place packages.
- **€100–500/mo at month 12**, assuming 2–4k subscribers. The bigger value is the list, which multiplies P2 and P3.

**Build and run.** 5–7 days. About 2 h/week, mostly checking dates; scrapers can flag changes on race sites.

**Risk.** Wrong dates destroy trust. Show "last verified" timestamps and link to the official source.

**2-week test.** Add "notify me" buttons to the 30 most oversubscribed race pages, post the data in r/running and r/AdvancedRunning, and put a fake-door "Pro" button on the page.
- **Pass:** ≥300 signups.
- **Fail:** fold it into the existing monthly newsletter and stop.

**Quick win while you're in there.** Booking.com closed its direct affiliate programme in June 2025 and moved to CJ, paying 25–40% of its commission with a session-only cookie ([Track360](https://track360.io/blog/booking-com-affiliate-partner-program-operator-teardown-2026)). Check that EuroSlam's hotel links still pay, and consider Stay22 instead: about 30% revenue share, built for events ([research/03](research/03-passive-running-adjacencies.md)). An estimated hotel click is worth about $0.40.

### P2. EuroSlam in 5 languages: long-tail race pages plus a free "PB-weather index"

**What.** Machine-translate and human-check EuroSlam's per-race pages into German, French, Spanish, Italian and Dutch. Each page carries data competitors lack:
- race-day weather history
- course difficulty
- trip-cost estimate
- a **PB-potential score** (historical temperature vs. the ~8–12°C optimum ([PMC review](https://pmc.ncbi.nlm.nih.gov/articles/PMC8293098)))

**Evidence.**
- Semrush, Nov 2026 ([research/01](research/01-passive-pseo-data.md)):
  - DE: "laufkalender" 1,600/mo, "halbmarathon 2027" 480/mo (KD18)
  - FR: "calendrier semi marathon" 480/mo (KD14)
  - ES: "carreras populares" 2,900/mo
- **Red-team correction:** the head terms mean "my local 5K/10K," and ahotu, finishers and marathons.com already serve them in several languages. Target only the **long tail**: "[race] 2027 Datum / Wetter / Anmeldung" ([research/06](research/06-red-team.md)). That intent is dated and transactional, a type that rarely triggers AI Overviews.

**Money (est.).**
- Hotel/Stay22 affiliates.
- Display ads once traffic qualifies: Mediavine Journey from about 1k sessions, Raptive from 25k pageviews ([SEJ](https://www.searchenginejournal.com/raptive-drops-traffic-requirement-by-75-to-25000-views/558780/)).
- **€200–1,000/mo at month 12**, assuming 10–30k sessions a month across languages.

**Build and run.** 7–10 days (i18n routing, hreflang, a translation pipeline, a weather-index job). About 2 h/week.

**Risk.** Google's "scaled content abuse" rules ([ppc.land](https://ppc.land/scaled-content-abuse/)). Every page must carry its own data; don't just translate boilerplate. The weather index is what makes the pages non-commodity.

**Test.** Publish 40 German race pages.
- **Pass:** ≥1,500 Search Console impressions within 4 weeks, then roll out FR/ES/IT/NL.

> Note: the weather index stays **free**. A paid "race pacing pack" was killed because racecast.io already does weather-adjusted race plans and search demand is near zero (§5).

### P3. EuroSlam inside AI assistants (MCP server / Claude connector / ChatGPT app)

**What.** Expose EuroSlam as a tool, so a question like *"find me a flat half marathon in a new country in April with cool weather"* gets answered from your data, with links to the race page and hotels.

**Why.**
- Anthropic opened connector-directory submissions on 25 Sep 2026, and Claude can suggest a connector in chat when it fits the user's task ([research/02](research/02-passive-microsaas-appstores.md)).
- The ChatGPT apps directory is young.
- Directories this early reward whoever shows up first.

**Honest economics.**
- These stores do **not** allow selling digital goods (ChatGPT), and more than 95% of MCP servers earn $0 (est., [dev.to](https://dev.to/nicolas_fainstein/the-state-of-mcp-monetization-in-2026-28i4)).
- This is a **cheap option on agent traffic**, not an income stream: **€0–300/mo at month 12** from extra affiliate clicks.
- Travel is a scrutinised category on ChatGPT, so check its affiliate-link rules before submitting.

**Build and run.** 3–5 days, reusing the race API. Under 1 h/week.

**Why it's on the list anyway.** It costs a week, it makes EuroSlam's data reachable from places other than Google, and it is the cheapest hedge against AI Overviews eating EuroSlam's search clicks.

### P4. e-Factura multi-company inbox for Romanian accountants ⭐ best non-running passive bet

**The problem.**
- Romanian accountants handle dozens to hundreds of client companies.
- ANAF's SPV portal and the e-Factura import in tools like Saga work **one company at a time**, each with its own SPV access ([folositor](https://folositor.ro/ghid/descarcare-facturi-efactura), [contabilul.ro](https://contabilul.manager.ro/a/28504/saga-ce-pasi-trebuie-sa-urmati-pentru-generare-si-transmitere-e-facturi.html)).
- CECCAR (the accountants' body) has publicly protested the duplicate e-Factura / SAF-T / D394 reporting burden ([StartupCafe](https://startupcafe.ro/contabili-ceccar-etva-extindere-efactura-presiune-firme-birocratie-4-propuneri-ministerul-27527)).
- The red team found **no multi-client cockpit built for accountants**. Existing players sell to the companies themselves: Keez, ContApp, SmartBill/Oblio, and QuickFin.erp, which runs AI bank reconciliation for companies ([research/06](research/06-red-team.md)).

**What.** One dashboard, using the ANAF developer API with OAuth, that:
- pulls received and sent e-Factura XML for **all** of an accountant's client tax IDs every night
- flags rejected or duplicate invoices
- renders human-readable PDFs
- exports in batch to Saga / WinMentor formats

**Money (est.).** €15–30 per accountant per month, or €1–2 per client company. 30–80 paying accountants by month 12 → **€500–2,000/mo**. Low churn, because the product sits in a daily workflow ([low-churn infra pattern](https://www.indiehackers.com/post/a-16k-mrr-founder-just-said-the-quiet-part-out-loud-infrastructure-products-have-low-churn-thats-the-whole-reason-i-m-building-one-7b0cf62fd6)).

**Build and run.** 10–15 days. 2–3 h/week (ANAF API changes, support in Romanian).

**Strategic bonus.** This is the **wedge for startup S1**: once accountants live in your inbox, you add AI posting and document chasing.

**Risks.**
- ANAF API instability.
- Saga or SmartBill could ship a multi-company view.
- Romanian price sensitivity.

**Test.** A Romanian landing page plus posts in accountant Facebook groups.
- **Pass:** 50 waitlist signups in 14 days, and 3 accountants who agree to a paid pilot.

### P5. Cyber Resilience Act scope checker + incident-report template pack

**The problem.**
- Since **11 Sep 2026**, every maker of software or connected products sold in the EU must report actively exploited vulnerabilities to ENISA's Single Reporting Platform: early warning in 24h, then 72h and final reports ([ENISA](https://www.enisa.europa.eu/news/the-cra-single-reporting-platform-is-launched), [Jones Day](https://www.jonesday.com/de/insights/2026/07/eu-cyber-resilience-act-24hour-reporting-duties-start-september-11-2026)).
- Full obligations (technical file, SBOM, conformity) hit on **11 Dec 2027**.
- About two-thirds of companies are unprepared ([ONEKEY](https://www.onekey.com/press-release/onekey-study-businesses-still-have-significant-ground-to-cover-on-cyber-resilience-act-readiness)).
- SMEs (about 99% of makers) struggle most with documentation ([DIGITAL SME](https://www.digitalsme.eu/cra-guide/), [Martel](https://martel-innovate.com/?p=363037)).

**What.**
- A **free** interactive checker: "Is my product in scope? Default, Important class I/II, or Critical? What do I owe, and by when?"
- A **€49–149 one-off pack**: 24h/72h/final report templates, a vulnerability-handling policy, an Annex VII technical-file skeleton and an SBOM how-to, in EN/DE/RO/PL.
- Long-tail SEO on regulation queries ("CRA Article 14 report template," "ENISA SRP").

**Money (est.).** 5–20 packs a month → **€200–1,000/mo**, plus a lead list for startup S3.

**Build and run.** 5–7 days. About 1 h/week, keeping templates current as ENISA guidance and harmonised standards land.

**Risk.**
- Templates are copyable, and big vendors (ONEKEY, Anchore, Sonatype) publish free guides.
- Legal accuracy: add a "not legal advice" notice and have a CRA consultant review it once.

**Test.**
- **Pass:** 100 completed checks and 5 pack sales in 14 days.

### P6. Atlassian Forge app that replaces a Data-Center-only app (conditional)

**Why.**
- Atlassian stopped new Data Center app submissions on 16 Dec 2025 and new DC sales on 30 Mar 2026, and **Data Center reaches end of life on 28 Mar 2029** ([Atlassian](https://www.atlassian.com/licensing/data-center-end-of-life)).
- Teams migrating to Cloud find some business-critical apps have no Cloud equivalent ([Modus](https://moduscreate.com/blog/migrating-atlassian-applications-from-server-to-cloud-faq)). That is demand forced by a deadline.
- Forge apps pay **0% revenue share on a partner's first $1M** of lifetime Forge revenue (Forge-only, with usage caveats) ([Atlassian](https://www.atlassian.com/blog/developers/updates-to-marketplace-revenue-share-2026)).
- Buyers pay per user and rarely churn, and the Atlassian store is far less flooded than Shopify's.

**Gate (5 days, do this before building).** Use the Marketplace API to list DC-only apps.
- Proceed only if you find ≥3 with 1,000+ installs whose best Cloud alternative has under 100 installs, plus ≥5 community threads asking for a Cloud version.
- Otherwise drop the idea.

**Money (est.).** $1–3 per user per month. 30–60 small instances → **$800–2,000/mo at month 12**. The only solo benchmark is old: $4.1k MRR at 18 months ([IH](https://www.indiehackers.com/post/reaching-4149-mrr-in-the-atlassian-marketplace-a3cc93a067)).

**Build and run.** 10–20 days. 2–4 h/week; enterprise security questionnaires are the main time cost.

**Risks.** The original vendor ports its own app first. No personal itch for the domain.

### Passive portfolio: what it adds up to (est.)

| Scenario | P1 | P2 | P3 | P4 | P5 | P6 | Total/mo at month 12 |
|---|---|---|---|---|---|---|---|
| Pessimistic | 100 | 200 | 0 | 300 | 100 | 0 (gate fails) | **~€700** |
| Base | 300 | 600 | 100 | 1,000 | 500 | 1,200 | **~€3,700** |
| Optimistic | 500 | 1,000 | 300 | 2,000 | 1,000 | 2,000 | **~€6,800** |

Total ongoing time if all six run: about 12–16 h/week. **That is a part-time job, not passive.** Run at most 3–4 at once and automate before adding the next.

---

## 4. Startup ideas (3)

All three share the same edge: **Romanian/CEE language and national systems (ANAF SPV, e-Factura, SAF-T, SICAP) that well-funded Western startups don't touch**, plus a founder who ships fast. In each case, start with the wedge you can sell in weeks, not the full platform.

### S1. AI back office for Romanian accounting firms ⭐ strongest

**Thesis.**
- Accounting is the first outsourced function Sequoia names in its "sell the work" thesis ([Sequoia](https://sequoiacap.com/article/services-the-new-software)).
- Elad Gil and General Catalyst back AI roll-ups of services firms ([TechCrunch](https://techcrunch.com/2025/06/01/early-ai-investor-elad-gil-finds-his-next-big-bet-ai-powered-rollups)).
- Western copies are well funded: Sumary $25M seed, Integral €18M, LimeTax €6M ([tech.eu](https://tech.eu/2026/11/10/sumary-secures-25m-to-expand-its-accounting-software-across-europe/)).
- **Nobody funded is doing Romania.** CECCAR has about 33k members ([Accountancy Europe](https://accountancyeurope.eu/fact-figure/romania/)), and their work is swamped by e-Factura + SAF-T (D406) + D394.

**Wedge → product.**
1. **P4 inbox** (weeks 0–4): multi-company e-Factura pull and export.
2. **Auto-posting** (weeks 4–10): e-Factura XML plus bank statements → proposed journal entries → export to Saga, WinMentor or SmartBill.
3. **Missing-document chaser**: an email/WhatsApp agent that asks clients for missing receipts and statements.
4. **SAF-T pre-check**: catches inconsistencies before D406 is filed.
5. *(Option, year 2+)* become an AI-native accounting firm or buy small firms. This is the roll-up path investors fund.

**Pricing (est.).** €4–10 per client company per month. A 200-client firm pays €1–2k/month. **€1M ARR ≈ 60 firms at €1.4k/month.**

**Go-to-market.** Accountant Facebook groups and CECCAR branch events, SEO in Romanian, referral discounts. P4's free tier is the funnel.

**Competitors.**
- Saga and WinMentor do per-company SPV import.
- Keez, ContApp and SmartBill/Oblio sell to companies.
- QuickFin.erp runs AI reconciliation for companies, not firms.
- Declaro.
- **Gap:** a multi-client, AI-first cockpit for the *firm*.

**Funding fit.** Nucleo Ventures' €34M Romania/CEE fund ([The Recursive](https://www.therecursive.com/cee-startup-tech-weekly-nucleo-ventures-launches-eur34m-fund-to-back-startups-across-romania-and-cee.md)), Credo Ventures' €74M pre-seed fund ([Pulse](https://www.pulse.bot/venture-capital/news/credo-ventures-launches-over-74m-new-fund-to-back-cee-startups-at-pre-seed-4f40485e-3640-4eff-ae7f-35796593db6c)), and roll-up backers such as Tenet.

**Risks.**
- Incumbent local software adds AI.
- Romanian price sensitivity; accountants adopt slowly.
- Liability for wrong postings: keep a human approving every entry.

**2-week validation.** Interview 15 firms with 30+ clients each. Run a concierge pilot: process one month of SPV invoices and bank statements into Saga for 3 firms, by hand plus scripts.
- **Pass:** 2 firms prepay at least €4 per client company per month.

### S2. AI bid desk for Romanian (then CEE) public tenders

**Thesis.**
- The closest proof is **Minerva (Poland), >$2.5M ARR**, whose clients have won 1,300 tenders worth PLN 1.25B ([WBJ](https://wbj.pl/ai-targets-tenders/post/149513)).
- Cato (€6M), Altura (€8M) and Forgent (€4.3M) are funded in the West.
- YC's Winter 2027 list asks for government and public-sector AI ([vccafe](https://www.vccafe.com/requests-for-startups-winter-2027-edition/)).
- Bid writing is already outsourced to consultants, so the budget exists.

**Wedge.**
1. Take a SICAP or TED notice and its 200-page *caiet de sarcini* (tender specification).
2. Produce a **requirements matrix** and a **DUAE (European procurement form) checklist**.
3. **Draft the technical proposal** from the client's past bids.
4. Watch the clarifications feed for changes.

**Pricing (est.).** €150–500 per month, plus done-for-you bids at €800–2,500. **€1M ARR ≈ 280 customers at about €300/month.**

**Go-to-market.**
- Award notices publish the winners' names, which gives you a free, complete prospect list.
- **Sell to bid consultants first** (red-team change): one consultant equals many bids.
- SEO page per tender.

**Competitors (including ones the scouts missed).**
- Local monitoring tools: licitatia.ro (AI search), DataDriven.ro (AI monitoring), sicap.ai (free).
- **Tendios** (€2M raised, has a Romania page, offers proposal generation), **TenderingOS** (launched in Romania Feb 2026), Mimira expanding.
- **The gap is drafting plus compliance checking in Romanian.** It is real but contested, so speed matters.

**Watch-out.** 44% of Romanian tenders get a single bidder, against 28% across the EU ([EU Single Market Scoreboard](https://single-market-scoreboard.ec.europa.eu/node/612_ro)). Tailored specifications limit how much better proposals help. Track this in the pilot.

**Funding fit.** OpenOcean (backed Minerva), Keen (backed Cato), Nucleo, Credo. YC's next intake is the Spring/Summer 2027 batch.

**2-week validation.** Give 10 bid consultants a free requirements matrix and DUAE checklist for a live tender.
- **Pass:** ≥4 use it on a real bid and ≥2 pay €150.

### S3. Cyber Resilience Act compliance for CEE hardware/IoT SMEs

**Thesis.**
- Reporting has been live since 11 Sep 2026; the 11 Dec 2027 conformity deadline is the real budget moment.
- The EU's SECURE call is putting **€11.5M of cascade funding into SME CRA work**, which subsidises buyers ([cyberresilienceact.eu](https://www.cyberresilienceact.eu/de/news/secure-second-open-call-1-october-2026-cra-sme-funding.html)).
- There are tens of thousands of obligated makers (est.).

**Red-team corrections.**
- The original €290–990 per product per month price is not credible: CRA-Ready lists $49/mo flat and Verimu was free until Sep 2026 ([Capterra](https://www.capterra.com/p/10045966/CRA-Ready/)).
- Reporting alone is a rare event; only actively exploited vulnerabilities trigger it.
- **Narrow to embedded, IoT and hardware SMEs in CEE.** Sell the hard part: **firmware SBOM + Annex VII technical file + Declaration of Conformity + reporting runbook** at **€99–299 per product per month**. Software-only makers are well served by SBOM incumbents (Anchore, Sonatype, Mend).

**Wedge.** P5's checker → lead → "technical file in a week" service, done by you with AI, productised over time.

**Competitors.** CRACI (€1.4M pre-seed), ONEKEY "CRA Fast Start", Cybellum (enterprise), CRA-Ready and Verimu (cheap, SBOM-only).

**Why it is third.**
- Weakest founder fit: no hardware or security-domain background is evident.
- Busiest field.
- The buying wave peaks in 2027, so there is time to validate cheaply via P5 first.

**2-week validation.** 30 LinkedIn/email conversations with CEE device makers.
- **Pass:** ≥3 paid pilots or letters of intent at €99+/month.

---

## 5. Researched and rejected (don't spend time here)

| Idea | Why killed | Evidence |
|---|---|---|
| Hyrox calendar + percentile calculator | Big market (1.5M+ athletes) but crowded: "hyrox events" is KD67, roxradar has a free calendar with alerts, five-plus percentile calculators exist, "hyrox calculator" gets 90/mo, and it's off-brand for you | [research/06](research/06-red-team.md) |
| Paid race pacing/plan packs | racecast.io already does weather-adjusted plans; search demand ≈ 0 (10–40/mo) | [research/06](research/06-red-team.md) |
| EU e-invoice format API / MCP | InvoiceXML, thelawin, Invopop, e-invoice.be (~€0.25/invoice), Storecove, open-source KSeF/XRechnung MCP servers, 8+ Shopify apps | [research/06](research/06-red-team.md) |
| Pay Transparency kit (Romania) | Romanian Senate rejected bill L445/2026 on 14 Oct 2026; AROBS and PwC Romania are already selling tools | [research/06](research/06-red-team.md) |
| Generic Shopify EU-compliance apps (GPSR, Omnibus, e-Rechnung) | 15–17 clones per niche, mostly with zero reviews | [research/02](research/02-passive-microsaas-appstores.md) |
| Strava-based products / paid Garmin apps | API terms (data shown only to its owner, AI ban, paid access); Garmin paid apps report 0 sales | [research/02](research/02-passive-microsaas-appstores.md) |
| Peer-to-peer bib marketplace | Races run official resale with their own rules (Copenhagen, Marseille-Cassis, Finishers) | [research/03](research/03-passive-running-adjacencies.md) |
| Boilerplates, WordPress plugins, RapidAPI APIs | Boilerplate revenue down; median WP plugin has ~20 installs; RapidAPI declining | [research/02](research/02-passive-microsaas-appstores.md) |
| CSRD / CBAM / EUDR / AI-Act high-risk tooling | Omnibus cut scope or delayed the deadlines | [research/04](research/04-startup-eu-regulation.md) |
| Crowded AI verticals (AI SDR, dental/medical voice receptionist, freight-forwarding agents, DACH property management) | Heavily funded incumbents; AI SDRs report high churn | [research/05](research/05-startup-vc-theses-ai.md) |

---

## 6. Open question: Klaruna

The team could not find out what klaruna.eu does: the sandbox couldn't reach it and it has no search footprint. Before acting on §4:
- If Klaruna is in **invoicing, accounting or fintech**, S1 and P4 may be *features of Klaruna* rather than new companies. That is good news: fold them in.
- If Klaruna is in **compliance/regtech**, S3 and P5 may belong to it.
- Either way, **don't run two startups in parallel.** Use the 2-week tests to decide whether a new idea beats Klaruna on evidence. Otherwise use the startup ideas only as Klaruna pivots or modules.

---

## 7. Suggested 90-day plan

| Weeks | Passive track (~8 h/wk) | Startup track |
|---|---|---|
| 1–2 | **P1** alerts plus the "notify me" test; fix hotel affiliate links (Stay22/CJ) | S1 interviews (15 accountants) and S2 consultant test running in parallel; no code yet |
| 3–4 | **P2** with 40 German pages plus the free weather index; **P3** connector (3 days) | Decide: S1 or S2 (or fold into Klaruna). Start the concierge pilot |
| 5–8 | **P4** inbox (it doubles as S1's wedge, if S1 wins); P6 5-day gate | MVP of the chosen startup with 3 design partners |
| 9–12 | **P5** checker plus pack; roll out P2 to FR/ES/IT/NL if Search Console passes | First paid customers; apply to Credo/Nucleo or YC S27 if traction shows |

**Kill rule for everything:** if an idea misses its test threshold, stop, write down what you learned, and move on. Ideas that pass are worth your build speed; ideas that don't will just add maintenance.

---

*Sources: every factual claim links to its source here or in [`research/`](research/). Revenue, ACV and timing figures marked (est.) are the research team's estimates, not data. Some sources are vendor or secondary write-ups, which are flagged in the research files.*
