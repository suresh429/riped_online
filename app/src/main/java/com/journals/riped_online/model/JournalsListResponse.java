package com.journals.riped_online.model;

import java.util.List;

public class JournalsListResponse {

    /**
     * journal_cnt : 240
     * status : true
     * message : Records Found
     * journal_details : [{"managejournal":"Acute and Chronic Disease Reports","journal":"acdr"},{"managejournal":"Advanced Techniques in Biology & Medicine","journal":"atbm"},{"managejournal":"Advancements in Genetic Engineering","journal":"mage"},{"managejournal":"Advances in  Automobile Engineering","journal":"aae"},{"managejournal":"Advances in dairy Research","journal":"adr"},{"managejournal":"Advances in Medical Ethics","journal":"ldame"},{"managejournal":"Advances in Medical Research","journal":"ldamr"},{"managejournal":"Advances in Pediatric Research","journal":"ldapr"},{"managejournal":"Advances in Pharmacoepidemiology and Drug Safety","journal":"pds"},{"managejournal":"Advances in Rare Diseases","journal":"ldard"},{"managejournal":"Agrotechnology","journal":"agt"},{"managejournal":"Anatomy & Physiology: Current Research","journal":"apcr"},{"managejournal":"Andrology-Open Access","journal":"ano"},{"managejournal":"Anesthesia & Clinical Research","journal":"jacr"},{"managejournal":"Angiology: Open Access","journal":"aoa"},{"managejournal":"Annals and Essences of Dentistry","journal":"aedj"},{"managejournal":"Anthropology","journal":"antp"},{"managejournal":"Applied Microbiology: Open Access","journal":"amoa"},{"managejournal":"Autism-Open Access","journal":"auo"},{"managejournal":"Biochemistry & Analytical Biochemistry","journal":"babcr"},{"managejournal":"Biochemistry & Pharmacology: Open Access","journal":"bcpc"},{"managejournal":"Bioenergetics: Open Access","journal":"beg"},{"managejournal":"Biologia Moderna","journal":"bm"},{"managejournal":"Biological Systems: Open Access","journal":"bso"},{"managejournal":"Biology and Medicine","journal":"blm"},{"managejournal":"Bipolar Disorder: Open Access","journal":"jbd"},{"managejournal":"Brain Disorders & Therapy","journal":"bdt"},{"managejournal":"Cardiovascular Pharmacology: Open Access","journal":"cpo"},{"managejournal":"Cell & Developmental Biology","journal":"cdb"},{"managejournal":"Chemotherapy: Open Access","journal":"cmt"},{"managejournal":"Clinical & Experimental Cardiology","journal":"jcec"},{"managejournal":"Clinical & Medical Biochemistry","journal":"cmbo"},{"managejournal":"Clinical Microbiology: Open Access","journal":"cmo"},{"managejournal":"Clinical Pediatrics: Open Access","journal":"cpoa"},{"managejournal":"Clinics in Mother and Child Health","journal":"cmch"},{"managejournal":"Cloning  & Transgenesis","journal":"ctg"},{"managejournal":"Current Synthetic and Systems Biology","journal":"cssb"},{"managejournal":"Dentistry","journal":"dcr"},{"managejournal":"Dermatology Case Reports","journal":"dmcr"},{"managejournal":"Diabetes Case Reports","journal":"dcrs"},{"managejournal":"Drug Designing: Open Access","journal":"ddo"},{"managejournal":"Emergency Medicine: Open Access","journal":"egm"},{"managejournal":"Endocrinology & Metabolic Syndrome","journal":"ems"},{"managejournal":"Entomology, Ornithology & Herpetology: Current Research","journal":"eohcr"},{"managejournal":"Enzyme Engineering","journal":"eeg"},{"managejournal":"Epigenetics Research: Open Access","journal":"eroa"},{"managejournal":"Family Medicine & Medical Science Research","journal":"fmmsr"},{"managejournal":"Fermentation Technology","journal":"fmt"},{"managejournal":"Fisheries and Aquaculture Journal","journal":"faj"},{"managejournal":"Forest Research: Open Access","journal":"jfor"},{"managejournal":"Fungal Genomics & Biology","journal":"fgb"},{"managejournal":"Gene Technology","journal":"rdt"},{"managejournal":"General Medicine: Open Access","journal":"gmo"},{"managejournal":"Gerontology & Geriatric Research","journal":"jggr"},{"managejournal":"Global Journal of Biology, Agriculture & Health Sciences","journal":"gjbahs"},{"managejournal":"Global Journal of Commerce & Management Perspective","journal":"gjcmp"},{"managejournal":"Global Journal of Engineering, Design & Technology","journal":"gjedt"},{"managejournal":"Global Journal of Interdisciplinary Social Sciences","journal":"gjiss"},{"managejournal":"Global Journal of Life Sciences and Biological Research","journal":"gjlsbr"},{"managejournal":"Global Research Journal of Science and Nature","journal":"grjsn"},{"managejournal":"Gynecology & Obstetrics","journal":"gocr"},{"managejournal":"Hair Therapy & Transplantation","journal":"htt"},{"managejournal":"Health Care : Current Reviews","journal":"hccr"},{"managejournal":"Healthy Aging Research","journal":"har"},{"managejournal":"Hereditary Genetics: Current Research","journal":"hgcr"},{"managejournal":"HIV: Current Research","journal":"hicr"},{"managejournal":"Immunogenetics: Open Access","journal":"igoa"},{"managejournal":"Immunological Disorders and Immunotherapy","journal":"idit"},{"managejournal":"Immunome Research","journal":"imr"},{"managejournal":"Immunotherapy: Open Access","journal":"imt"},{"managejournal":"Intellectual Property Rights: Open Access","journal":"ipr"},{"managejournal":"Internal Medicine: Open Access","journal":"ime"},{"managejournal":"International Journal of Accounting Research","journal":"ijar"},{"managejournal":"International Journal of Advancements in Technology","journal":"ijoat"},{"managejournal":"International Journal of Biomedical Data Mining","journal":"jbdm"},{"managejournal":"International Journal of Physical Medicine & Rehabilitation","journal":"jpmr"},{"managejournal":"International Journal of School and Cognitive Psychology","journal":"ijscp"},{"managejournal":"International Journal of Swarm Intelligence and Evolutionary Computation","journal":"siec"},{"managejournal":"International Journal of Waste Resources","journal":"ijwr"},{"managejournal":"Journal of Advanced Chemical Engineering","journal":"ace"},{"managejournal":"Journal of Aeronautics & Aerospace Engineering","journal":"jaae"},{"managejournal":"Journal of Aging Science","journal":"jasc"},{"managejournal":"Journal of Agricultural Science and Food Research","journal":"jbfbp"},{"managejournal":"Journal of Alcoholism & Drug Dependence","journal":"jaldd"},{"managejournal":"Journal of Allergy & Therapy","journal":"jat"},{"managejournal":"Journal of Anthropology Reports","journal":"jfa"},{"managejournal":"Journal of Antivirals & Antiretrovirals","journal":"jaa"},{"managejournal":"Journal of Applied Mechanical Engineering","journal":"jame"},{"managejournal":"Journal of Applied Pharmacy","journal":"jap"},{"managejournal":"Journal of Aquaculture Research & Development","journal":"jard"},{"managejournal":"Journal of Astrobiology & Outreach","journal":"jao"},{"managejournal":"Journal of Bacteriology & Parasitology","journal":"jbp"},{"managejournal":"Journal of Bioequivalence & Bioavailability","journal":"jbb"},{"managejournal":"Journal of Biomedical Engineering and Medical Devices","journal":"bemd"},{"managejournal":"Journal of Biomolecular Research & Therapeutics","journal":"bom"},{"managejournal":"Journal of Blood Disorders & Transfusion","journal":"jbdt"},{"managejournal":"Journal of Bone Research","journal":"bmrj"},{"managejournal":"Journal of Cancer Research and Immuno-Oncology","journal":"jcrio"},{"managejournal":"Journal of Cancer Science and Research","journal":"jcsr"},{"managejournal":"Journal of Carcinogenesis & Mutagenesis","journal":"jcm"},{"managejournal":"Journal of Cell Science & Therapy","journal":"jcest"},{"managejournal":"Journal of Cell Signaling","journal":"jcs"},{"managejournal":"Journal of Chemical Engineering & Process Technology","journal":"jcept"},{"managejournal":"Journal of Chromatography & Separation Techniques","journal":"jcgst"},{"managejournal":"Journal of Climatology & Weather Forecasting","journal":"jcwf"},{"managejournal":"Journal of Clinical & Experimental Dermatology Research","journal":"jcedr"},{"managejournal":"Journal of Clinical & Experimental Pharmacology","journal":"cpecr"},{"managejournal":"Journal of Clinical and Cellular Immunology","journal":"jcci"},{"managejournal":"Journal of Clinical and Experimental Ophthalmology","journal":"jceo"},{"managejournal":"Journal of Clinical and Medical Sciences","journal":"jcms"},{"managejournal":"Journal of Clinical Chemistry and Laboratory Medicine","journal":"jcclm"},{"managejournal":"Journal of Clinical Microbiology and Antimicrobials","journal":"jcma"},{"managejournal":"Journal of Clinical Research & Bioethics","journal":"jcrb"},{"managejournal":"Journal of Clinical Toxicology","journal":"jct"},{"managejournal":"Journal of Clinical Trials","journal":"jctr"},{"managejournal":"Journal of Coastal Zone Management","journal":"jczm"},{"managejournal":"Journal of Communication Disorders, Deaf Studies & Hearing Aids","journal":"jcdsha"},{"managejournal":"Journal of Data Mining in Genomics & Proteomics","journal":"jdmgp"},{"managejournal":"Journal of Defense Management","journal":"jdfm"},{"managejournal":"Journal of Depression and Anxiety","journal":"jda"},{"managejournal":"Journal of Dermatitis","journal":"jod"},{"managejournal":"Journal of Developing Drugs","journal":"eoed"},{"managejournal":"Journal of Diabetes & Metabolism","journal":"jdm"},{"managejournal":"Journal of Down Syndrome & Chromosome Abnormalities","journal":"jdsca"},{"managejournal":"Journal of Drug Metabolism & Toxicology","journal":"jdmt"},{"managejournal":"Journal of Ergonomics","journal":"jer"},{"managejournal":"Journal of Eye Diseases and Disorders","journal":"jedd"},{"managejournal":"Journal of Fertilization: In Vitro - IVF-Worldwide, Reproductive Medicine, Genetics & Stem Cell Biol","journal":"jfiv"},{"managejournal":"Journal of Food Processing & Technology","journal":"jfpt"},{"managejournal":"Journal of Food: Microbiology, Safety & Hygiene","journal":"jfmsh"},{"managejournal":"Journal of Forensic Biomechanics","journal":"jfb"},{"managejournal":"Journal of Forensic Pathology","journal":"jfp"},{"managejournal":"Journal of Forensic Psychology","journal":"jfpy"},{"managejournal":"Journal of Fundamentals of Renewable Energy and Applications","journal":"jfra"},{"managejournal":"Journal of Genetic Syndromes & Gene Therapy","journal":"jgsgt"},{"managejournal":"Journal of Geography  & Natural Disasters","journal":"jgnd"},{"managejournal":"Journal of Geology & Geophysics","journal":"jgg"},{"managejournal":"Journal of Glycobiology","journal":"jgb"},{"managejournal":"Journal of Glycomics & Lipidomics","journal":"jgl"},{"managejournal":"Journal of Hematology & Thromboembolic Diseases","journal":"jhtd"},{"managejournal":"Journal of Hepatology and Gastrointestinal disorders","journal":"jhgd"},{"managejournal":"Journal of Horticulture","journal":"horticulture"},{"managejournal":"Journal of Hotel and Business Management","journal":"jhbm"},{"managejournal":"Journal of Infectious Diseases & Preventive Medicine","journal":"jadpr"},{"managejournal":"Journal of Infectious Diseases and  Diagnosis","journal":"jidd"},{"managejournal":"Journal of Information Technology & Software Engineering","journal":"jitse"},{"managejournal":"Journal of Kidney","journal":"jok"},{"managejournal":"Journal of Leukemia","journal":"jlu"},{"managejournal":"Journal of Liver","journal":"jlr"},{"managejournal":"Journal of Medical & Surgical Pathology","journal":"jmsp"},{"managejournal":"Journal of Medical Diagnostic Methods","journal":"jmdm"},{"managejournal":"Journal of Membrane Science & Technology","journal":"jmst"},{"managejournal":"Journal of Microbial & Biochemical Technology","journal":"jmbt"},{"managejournal":"Journal of Molecular Imaging & Dynamics","journal":"jmid"},{"managejournal":"Journal of Molecular Pathology and Biochemistry","journal":"jmpb"},{"managejournal":"Journal of Nanomedicine & Biotherapeutic Discovery","journal":"jnbd"},{"managejournal":"Journal of Nanomedicine & Nanotechnology","journal":"jnmnt"},{"managejournal":"Journal of Neonatal Biology","journal":"jnb"},{"managejournal":"Journal of Next Generation Sequencing & Applications","journal":"jngsa"},{"managejournal":"Journal of Nutrition & Food Sciences","journal":"jnfs"},{"managejournal":"Journal of Nutrition & Weight Loss","journal":"jnwl"},{"managejournal":"Journal of Nutritional Disorders & Therapy","journal":"jndt"},{"managejournal":"Journal of Oceanography and Marine Research","journal":"ocn"},{"managejournal":"Journal of Ocular Infection and Inflammation","journal":"joii"},{"managejournal":"Journal of Odontology","journal":"joy"},{"managejournal":"Journal of Osteoporosis and Physical Activity","journal":"jopa"},{"managejournal":"Journal of Pain Management & Medicine","journal":"jpmme"},{"managejournal":"Journal of Patient Care","journal":"jpc"},{"managejournal":"Journal of Perioperative & Critical Intensive Care Nursing","journal":"jpcic"},{"managejournal":"Journal of Perioperative Medicine","journal":"jpme"},{"managejournal":"Journal of Petroleum & Environmental Biotechnology","journal":"jpeb"},{"managejournal":"Journal of Pharmaceutical Care & Health Systems","journal":"jpchs"},{"managejournal":"Journal of Pharmacogenomics & Pharmacoproteomics","journal":"jpp"},{"managejournal":"Journal of Pharmacological Reports","journal":"jpr"},{"managejournal":"Journal of Pharmacovigilance","journal":"jp"},{"managejournal":"Journal of Phonetics & Audiology","journal":"jpay"},{"managejournal":"Journal of Physical Chemistry & Biophysics","journal":"jpcb"},{"managejournal":"Journal of Plant Biochemistry & Physiology","journal":"jpbp"},{"managejournal":"Journal of Plant Pathology & Microbiology","journal":"jppm"},{"managejournal":"Journal of Political Sciences & Public Affairs","journal":"jpspa"},{"managejournal":"Journal of Pollution Effects & Control","journal":"jpe"},{"managejournal":"Journal of Probiotics & Health","journal":"jph"},{"managejournal":"Journal of Proteomics & Bioinformatics","journal":"jpb"},{"managejournal":"Journal of Psychiatry","journal":"jop"},{"managejournal":"Journal of Psychological Abnormalities","journal":"jpac"},{"managejournal":"Journal of Psychology & Psychotherapy","journal":"jppt"},{"managejournal":"Journal of Remote Sensing & GIS","journal":"jgrs"},{"managejournal":"Journal of Research and Development","journal":"jrd"},{"managejournal":"Journal of Sleep Disorders & Therapy","journal":"jsdt"},{"managejournal":"Journal of Socialomics","journal":"jsc"},{"managejournal":"Journal of Stem Cell Research & Therapy","journal":"jscrt"},{"managejournal":"Journal of Steroids & Hormonal Science","journal":"jshs"},{"managejournal":"Journal of Stock & Forex Trading","journal":"jsft"},{"managejournal":"Journal of Surgery and Anesthesia","journal":"jsa"},{"managejournal":"Journal of Theoretical & Computational Science","journal":"jtco"},{"managejournal":"Journal of Thermodynamics & Catalysis","journal":"jtc"},{"managejournal":"Journal of Thrombosis and Circulation: Open Access","journal":"jtcoa"},{"managejournal":"Journal of Thyroid Disorders & Therapy","journal":"jtdt"},{"managejournal":"Journal of Tourism & Hospitality","journal":"jth"},{"managejournal":"Journal of Tropical Diseases & Public Health","journal":"jtd"},{"managejournal":"Journal of Tumor Research","journal":"jtdr"},{"managejournal":"Journal of Tumour Research & Reports","journal":"jtrr"},{"managejournal":"Journal of Vaccines & Vaccination","journal":"jvv"},{"managejournal":"Journal of Vascular Medicine & Surgery","journal":"jvms"},{"managejournal":"Journal of Women's Health Care","journal":"jwh"},{"managejournal":"Journal of Yoga & Physical Therapy","journal":"jypt"},{"managejournal":"Lupus: Open Access","journal":"loa"},{"managejournal":"Mass Spectrometry & Purification Techniques","journal":"mso"},{"managejournal":"Maternal and Pediatric Nutrition","journal":"mpn"},{"managejournal":"Mathematica Eterna","journal":"me"},{"managejournal":"Medical & Surgical Urology","journal":"msu"},{"managejournal":"Medical Safety & Global Health","journal":"msgh"},{"managejournal":"Medicina Moderna","journal":"mm"},{"managejournal":"Medicinal & Aromatic Plants","journal":"map"},{"managejournal":"Modern Chemistry & Applications","journal":"mca"},{"managejournal":"Mycobacterial Diseases","journal":"mdtl"},{"managejournal":"Natural Products Chemistry & Research","journal":"npcr"},{"managejournal":"Oral Health and Dental Management","journal":"ohdm"},{"managejournal":"Organic Chemistry: Current Research","journal":"occr"},{"managejournal":"Orthopedic & Muscular System: Current Research","journal":"omcr"},{"managejournal":"Pancreatic Disorders & Therapy","journal":"pdt"},{"managejournal":"Pediatrics & Therapeutics","journal":"ptcr"},{"managejournal":"Pharmaceutica Analytica Acta","journal":"paa"},{"managejournal":"Pharmaceutical Analytical Chemistry: Open Access","journal":"paco"},{"managejournal":"Physica Eterna","journal":"pe"},{"managejournal":"Poultry, Fisheries & Wildlife Sciences","journal":"pfw"},{"managejournal":"Reconstructive Surgery & Anaplastology","journal":"acr"},{"managejournal":"Reproductive System & Sexual Disorders: Current Research","journal":"rssd"},{"managejournal":"Review of Public Administration and Management","journal":"rpam"},{"managejournal":"Rheumatology: Current Research","journal":"rcr"},{"managejournal":"SEO Database","journal":"seo"},{"managejournal":"SEO Database","journal":"seo"},{"managejournal":"Single Cell Biology","journal":"scpm"},{"managejournal":"Sociology and Criminology-Open Access","journal":"scoa"},{"managejournal":"Surgery: Current Research","journal":"scr"},{"managejournal":"targets","journal":"targets"},{"managejournal":"Transcriptomics: Open Access","journal":"toa"},{"managejournal":"Translational Medicine","journal":"tmcr"},{"managejournal":"Tropical Medicine & Surgery","journal":"tpms"},{"managejournal":"Virology & Mycology","journal":"vmid"}]
     */

    private int journal_cnt;
    private boolean status;
    private String message;
    private List<JournalDetailsBean> journal_details;

    public int getJournal_cnt() {
        return journal_cnt;
    }

    public void setJournal_cnt(int journal_cnt) {
        this.journal_cnt = journal_cnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<JournalDetailsBean> getJournal_details() {
        return journal_details;
    }

    public void setJournal_details(List<JournalDetailsBean> journal_details) {
        this.journal_details = journal_details;
    }

    public static class JournalDetailsBean {
        /**
         * managejournal : Acute and Chronic Disease Reports
         * journal : acdr
         */

        private String managejournal;
        private String journal;

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }
    }
}
