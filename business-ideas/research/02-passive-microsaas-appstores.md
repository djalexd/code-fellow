# Passive Scout #2 — Micro-SaaS, marketplace apps, extensions, APIs & AI-agent tools

*Role: Passive-Income Scout #2. Web search, mid-Nov 2026; some hosts blocked, so some points rest on snippets. **(est.)** = scout's own estimate.*

## 1. Which channels still deliver installs and money
- **Shopify App Store is flooded:** new launches 500–700/mo historically, **2,861 in May 2026**, >1,500/mo since; 80% of new apps have no reviews ([taylorsicard](https://taylorsicard.com/blog/shopify-app-store-statistics-2026)); median app <$1k/mo (est., [AdsX](https://adsx.com/blog/how-much-shopify-app-developers-make)). 0% fee on first $1M ([Shopify](https://shopify.dev/docs/apps/launch/distribution/revenue-share)); Shopify apps ~3.0x revenue on Acquire ([BigIdeasDB](https://bigideasdb.com/state-of-saas-valuations-2026)). Zigpoll ~$125k MRR solo ([IH](https://www.indiehackers.com/post/hitting-125k-mrr-as-a-solo-founder-by-doubling-down-on-the-right-segment-c4o2Tfs6mjdpip5yZhaO)).
- **EU compliance apps on Shopify are cloned:** ~17 German e-Rechnung apps, ~15 GPSR, ~15 Omnibus price-history ($5–10/mo), 7+ withdrawal-button apps; Shopify ships free "Comply" for Verifactu ([TechShow](https://www.techshowmadrid.es/en/noticias/comply-la-solucion-oficial-de-shopify-pos-para-cumplir-con-verifactu-ticketbai-y-sii)). → Moat is speed + reviews, not code.
- **Atlassian Marketplace:** 0% on first $1M lifetime Forge revenue from 1 Jan 2026, stepped standard fees through 1 Oct 2026 ([Atlassian](https://www.atlassian.com/blog/developer/updates-to-marketplace-revenue-share-2026)). **Data Center stopped new sales Mar 2026; EOL 28 Mar 2029**; some business-critical apps have no migration path ([Modus](https://moduscreate.com/blog/migrating-atlassian-applications-from-server-to-cloud-faq), [Wikman](https://jimiwikman.se/writings/my-articles/atlassian/atlassian-data-center-is-officially-ending-on-march-28-2029-r258)). Old solo benchmark: $1,285 MRR @6mo, $4,149 @18mo (2020) ([IH](https://www.indiehackers.com/post/reaching-4149-mrr-in-the-atlassian-marketplace-a3cc93a067)).
- **Chrome Web Store:** 0.5–2% free→paid ([dev.to](https://dev.to/ktg0215/real-numbers-freemium-chrome-extension-monetization-after-6-months-5hga)); MV2 removed 31 Aug 2026; MV3 bans remote code ([Chrome](https://developer.chrome.com/docs/extensions/mv3/mv2-sunset)).
- **AI agent stores = distribution, not payments:** ChatGPT apps can't sell digital goods ([OpenAI forum](https://community.openai.com/t/chatgpt-app-monetization-apps-sdk/1372343), [guidelines](https://developers.openai.com/apps-sdk/app-submission-guidelines)); Anthropic connector submissions opened 25 Sep 2026, no paid listings found ([pillitteri](https://pasqualepillitteri.it/en/news/18444/anthropic-portal-submit-plugins-mcp-connectors-claude)); >95% of MCP servers earn $0 (est., [dev.to](https://dev.to/nicolas_fainstein/the-state-of-mcp-monetization-in-2026-28i4)); Cloudflare x402 pay-per-call in closed beta ([Cloudflare](https://blog.cloudflare.com/monetization-gateway/)).
- **Avoid:** RapidAPI (sold to Nokia, decline) ([TechCrunch](https://techcrunch.com/2024/11/13/nokia-acquires-rapid-the-api-company-once-valued-at-1b/)); boilerplates (Marc Lou 2025 revenue −20%; unverified ShipFast −98%) ([aiidelist](https://aiidelist.com/blog/shipfast-revenue-collapse-marc-lou-2026)); WordPress plugins (median ~20 installs) ([profitable.app](https://profitable.app/wordpress-plugins/stats)).

## 2. Support load
Low: products in someone else's flow, configured once; small feature set; infrastructure/API buyers ([IH](https://www.indiehackers.com/post/a-16k-mrr-founder-just-said-the-quiet-part-out-loud-infrastructure-products-have-low-churn-thats-the-whole-reason-i-m-building-one-7b0cf62fd6)). High: merchant tax/invoicing apps (country edge cases, liability), accessibility overlays (FTC fined accessiBe $1M, [JD Supra](https://jdsupra.com/legalnews/ftc-targets-accessibility-overlays-5593127)), generic AI wrappers.

## 3. Runner platforms are mostly closed
- **Strava:** data visible only to its owner, AI use banned since Nov 2024 ([DC Rainmaker](https://dcrainmaker.com/2024/11/stravas-changes-to-kill-off-apps.html)); from June 2026 paid developer subscription (reported $11.99/mo) and intermediaries banned ([Notebookcheck](https://www.notebookcheck.net/Strava-just-pulled-a-Reddit-on-its-developer-community.1312468.0.html)); club endpoints removed Sep 2026 ([changelog](https://developers.strava.com/docs/changelog/)).
- **Garmin Connect IQ:** 15% cut + $100/yr; a 2026 case: free apps 1,000+ downloads, paid app 0 purchases ([forum](https://forums.garmin.com/developer/connect-iq/f/showcase/430838/i-monetized-my-ski-app-here-s-what-happened/2013903)).

## 4. Candidates
- **A. Forge app replacing a Data-Center-only Atlassian app** — $1–3/user/mo (est.); build 10–20 days; 2–4h/wk; $800–2,000 MRR @12mo (est.). Risk: original vendor ports first; no domain itch.
- **B. EuroSlam race-finder as MCP server / ChatGPT app / Claude connector** — 3–5 days; ~1h/wk; €0–300/mo extra affiliate (est.). Distribution option, not income.
- **C. EU e-invoice format API + MCP** — JSON → XRechnung / Factur-X / Peppol BIS / RO_CIUS / KSeF FA(3). Competitors Invopop, xhub, thelawin; validation floor ~$4 per 1k invoices ([Apify](https://apify.com/kamerozkan/xrechnung-xml-batch-validator-api)). $19–99/mo; 15–25 days; $300–1,500 MRR (est.).
- **D. Fast-follower e-invoicing app for unflooded markets** (Croatia Fiscalization 2.0, small Polish KSeF taxpayers 2027) — €9–15/mo; 3–5h/wk (not passive). Romania already taken by eFacturio ([eFacturio](https://apps.shopify.com/efacturio)).
- **E. Free Garmin EuroSlam watch face** — marketing only.

## 5. Top 3
1. **A — Atlassian DC-gap Forge app** (validate first)
2. **B — Race-finder agent app** (cheap option on agent commerce)
3. **C — E-invoice API**

**Avoid:** generic Shopify compliance clones, accessibility overlays, boilerplates, Strava-based products, RapidAPI.
