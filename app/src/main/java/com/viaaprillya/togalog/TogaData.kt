package com.viaaprillya.togalog

object TogaData {
    private val toga_nama_lokal = arrayOf("Sirih",
        "Pepermin",
        "Kenikir",
        "Seledri",
        "Peterseli",
        "Jahe",
        "Kemangi",
        "Temulawak",
        "Rosemari",
        "Lidah Buaya",
        "Kelor"
    )

    private val toga_nama_ilmiah = arrayOf("Piper betle L.",
        "Mentha × piperita",
        "Cosmos Caudatus L.",
        "Apium graveolens L.",
        "Petroselinum crispum",
        "Zingiber officinale",
        "Ocimum africanum",
        "Curcuma zanthorrhiza",
        "Rosmarinus officinalis",
        "Aloe Vera",
        "Moringa oleifera"
    )

    private val toga_desc = arrayOf("Sirih adalah tanaman asli Indonesia yang tumbuh merambat atau bersandar pada batang pohon lain. Tanaman merambat ini bisa mencapai tinggi 15 m. Batang sirih berwarna coklat kehijauan,berbentuk bulat, beruas dan merupakan tempat keluarnya akar. Daunnya yang tunggal berbentuk jantung, berujung runcing, tumbuh berselang-seling, bertangkai, dan mengeluarkan bau yang sedap bila diremas. Panjangnya sekitar 5 – 8 cm dan lebar 2 – 5 cm. Bunganya majemuk berbentuk bulir dan terdapat daun pelindung ± 1 mm berbentuk bulat panjang. Pada bulir jantan panjangnya sekitar 1,5 – 3 cm dan terdapat dua benang sari yang pendek sedang pada bulir betina panjangnya sekitar 1,5 – 6 cm dimana terdapat kepala putik tiga sampai lima buah berwarna putih dan hijau kekuningan. Buahnya buah buni berbentuk bulat berwarna hijau keabu-abuan. Akarnya tunggang, bulat dan berwarna coklat kekuningan.",
        "Pepermin merupakan tanaman yang sebagian besar ditanam di Eropa. Daun mint memiliki panjang 4-9 cm dan lebar 1,5-4 cm, berwarna hijau gelap dengan urat kemerahan, dan margin bergigi kasar. Selain itu, Ia juga memiliki bunga berwarna ungu, panjang sekira 6-8 mm. Bunga mint sendiri tumbuh secara whorl (verticillaster) di sekitar batang.",
        "Kenikir adalah tumbuhan tropis anggota suku kenikir-kenikiran (Asteraceae) yang berasal dari Amerika Latin dan Amerika Tengah,tetapi tumbuh liar dan mudah didapati di Florida, Amerika Serikat, serta di negara-negara Asia Tenggara dan Asia Selatan. Kenikir adalah tumbuhan tahunan yang berbatang pipa dengan garis-garis yang membujur. Tingginya dapat mencapai 1 m dan daunnya bertangkai panjang dan duduk daunnya berhadapan, sehingga terbagi menyirip menjadi 2-3 tangkai. Baunya seperti damar apabila diremas. Bunganya tersusun pada bongkol yang banyak terdapat di ujung batang dan pada ketiak daun-daun teratas, berwarna merah berbintik-bintik kuning di tengah-tengahnya, dan bijinya berbentuk paruh.",
        "Seledri adalah terna kecil, kurang dari 1m tingginya. Daun tersusun gemuk dengan tangkai pendek. Tangkai ini pada kultivar tertentu dapat sangat besar dan dijual sebagai sayuran terpisah dari emaknya. Batangnya biasanya sangat bantet. Pada kelompok budidaya tertentu membesar membentuk umbi, yang juga dapat dimakan. Bunganya tersusun majemuk berkarang. Buahnya kecil-kecil berwarna coklat gelap.",
        "Daun peterseli mirip dengan seledri yang lancip dan hijau gelap. Perbedaannya peterseli memiliki daun yang lebih kecil dari seledri. Daunnya cenderung menggerombol dan keriting. Batang peterseli berbentuk bulat dan halus, berbeda dari seledri yang bergerigi.",
        "Jahe diperkirakan merupakan tumbuhan pribumi Asia Tenggara. Rimpangnya berbentuk jemari yang menggembung di ruas-ruas tengah. Tumbuhan jahe dikategorikan sebagai tumbuhan kultigen dan tidak tersedia lagi dalam bentuk liar di alam. Hal ini disebabkan karena jahe telah kehilangan kemampuannya tumbuh melalui biji seperti kebanyakan jenis rempah-rempah lainnya dan hanya bisa berkembang biak melalui reproduksi vegetatif menggunakan akarnya yang merupakan akibat dari seleksi buatan yang dilakukan manusia. Batang jahe merupakan batang semu dengan tinggi 30 hingga 100 cm. Akarnya berbentuk rimpang dengan daging akar berwarna kuning hingga kemerahan dengan bau menyengat. Daun menyirip dengan panjang 15 hingga 23 mm dan panjang 8 hingga 15 mm. Tangkai daun berbulu halus. Bunga jahe tumbuh dari dalam tanah berbentuk bulat telur dengan panjang 3,5 hingga 5 cm dan lebar 1,5 hingga 1,75 cm. Gagang bunga bersisik sebanyak 5 hingga 7 buah. Bunga berwarna hijau kekuningan. Bibir bunga dan kepala putik ungu. Tangkai putik berjumlah dua.",
        "Kemangi adalah tumbuhan tahunan yang tumbuh tegak dengan cabang yang banyak. Tanaman ini berbentuk perdu yang tingginya dapat mencapai 100 cm. Bunganya tersusun di tandan yang tegak. Daunnya panjang, tegak, berbentuk taji atau bulat telur, berwarna hijau muda dan berbau harum. Ujung daun bisa tumpul atau bisa juga tajam, panjangnya mencapai 5 cm. Permukaan bergerigi atau juga rata. Wanginya seperti cengkih dan rasanya pahit. Spesies ini banyak terdapat di Asia dan Amerika. Di Pulau Jawa, kemangi/surawung ditanam di kebun-kebun, di pagar-pagar, di pinggir-pinggir jalan, di lapangan, dan di huma-huma. Umumnya ditanam sebagai tanaman yang dibudidayakan. Walapun demikian, hasil tumbuhan dapat memenuhi kebutuhan masyarakat. Asalnya belum diketahui secara pasti. Tumbuhan ini dapat tumbuh di dataran rendah hingga pada ketinggian 500 mdpl. Perkembangbiakan tumbuhan ini dapat dilakukan dengan biji.",
        "Temu lawak adalah tumbuhan obat yang tergolong dalam suku temu-temuan. Ia berasal dari Indonesia, khususnya Pulau Jawa, kemudian menyebar ke beberapa tempat di kawasan wilayah biogeografi Malesia. Terna berbatang semu dengan tinggi hingga lebih dari satu meter, tetapi kurang dari dua meter. Batang semu merupakan bagian dari pelepah daun yang tegak dan saling bertumpang tindih, warnanya hijau atau coklat gelap. Rimpang terbentuk dengan sempurna dan bercabang kuat, berukuran besar, bercabang-cabang, dan berwarna cokelat kemerahan, kuning tua atau berwarna hijau gelap. Tiap tunas dari rimpang membentuk daun 2 – 9 helai dengan bentuk bundar memanjang sampai bangun lanset, warna daun hijau atau coklat keunguan terang sampai gelap, panjang daun 31 – 84 cm dan lebar 10 – 18 cm, panjang tangkai daun termasuk helaian 43 – 80 cm, pada setiap helaian dihubungkan dengan pelepah dan tangkai daun agak panjang. Bunganya berwarna kuning tua, berbentuk unik dan bergerombol yakni perbungaan lateral. tangkai ramping dan sisik berbentuk garis, panjang tangkai 9 – 23 cm dan lebar 4 – 6 cm, berdaun pelindung banyak yang panjangnya melebihi atau sebanding dengan mahkota bunga. Kelopak bunga berwarna putih berbulu, panjang 8 – 13 mm, mahkota bunga berbentuk tabung dengan panjang keseluruhan 4.5 cm, helaian bunga berbentuk bundar memanjang berwarna putih dengan ujung yang berwarna merah dadu atau merah, panjang 1,25 – 2cm dan lebar satu cm, sedangkan daging rimpangnya berwarna jingga tua atau kecokelatan, beraroma tajam yang menyengat dan rasanya pahit.",
        "Rosemari merupakan tanaman herbal yang berasal dari daratan Mediterania. Namun, tanaman herbal ini kini telah banyak dibudidayakan di Indonesia. Rosemari merupakan suatu bahan rempah dan salah satu tanaman yang termasuk dalam tanaman herbal aromatik karena memiliki aroma yang khas. Tanaman yang daunnya hijau gelap di atas dan putih berbulu di bawah ini. Berdaun sempit dan runcing memiliki panjang 2- 3,5 cm. Bunganya biru keunguan atau keputihan ditanggung di aksila kecil (yaitu, muncul dari sudut antara daun dan batang) racemes. Kelopak dan corolla berbibir dua, yang panjang keduanya sekitar 1,25 cm dan didalamnya terdapat dua benang sari. ",
        "Lidah buaya (Aloe vera) adalah spesies tumbuhan dengan daun berdaging tebal dari genus Aloe. Tumbuhan ini bersifat menahun, berasal dari Jazirah Arab, dan tanaman liarnya telah menyebar ke kawasan beriklim tropis, semi-tropis, dan kering di berbagai belahan dunia. Aloe vera adalah tumbuhan tanpa batang atau berbatang pendek, dengan tinggi hingga 60–100 cm dan dapat berkembang biak dengan tunas. Dedaunannya berdaging tebal, berwarna hijau atau hijau keabuan, dan sebagian varietas memiliki bintik putih pada permukaan batangnya. Pinggir daunnya berbentuk serrata (seperti gergaji) dengan gerigi putih kecil. Bunga-bunganya tumbuh pada musim panas di sebuah tangkai setinggi hingga 90 cm. Setiap bunga tersebut berposisi menggantung, dan mahkotanya berbentuk tabung sepanjang 2–3 cm.",
        "Kelor adalah tanaman yang bisa tumbuh dengan cepat, berumur panjang, berbunga sepanjang tahun, dan tahan kondisi panas ekstrim. Tanaman ini berasal dari daerah tropis dan subtropis di Asia Selatan. Tanaman ini umum digunakan untuk menjadi pangan dan obat di Indonesia. Biji kelor juga digunakan sebagai penjernih air skala kecil. Tanaman kelor memiliki ketinggian 7-11 meter, berbatang berkayu (lignosus), tegak, berwarna putih kotor, kulit tipis, permukaan kasar; percabangan simpodial, arah cabang tegak atau miring, cenderung tumbuh lurus dan memanjang. Daun kelor memliki ciri berupa: majemuk, bertangkai panjang, tersusun berseling, beranak daun gasal (imparipinnatus), helai daun saat muda berwarna hijau muda. Buah berbentuk panjang bersegi tiga, panjang 20 - 60 cm; buah muda berwarna hijau - setelah tua menjadi cokelat, bentuk biji bulat - berwarna coklat kehitaman, berbuah setelah berumur 12 - 18 bulan. Akar tunggang, berwarna putih, membesar seperti lobak.")

    private val toga_khasiat = arrayOf("Minyak atsiri dari daun sirih mengandung minyak terbang (betIephenol), seskuiterpen, pati, diatase, gula dan zat samak dan kavikol yang memiliki daya mematikan kuman, antioksidasi dan fungisida, anti jamur. Sirih berkhasiat menghilangkan bau badan yang ditimbulkan bakteri dan cendawan. Daun sirih juga bersifat menahan perdarahan, menyembuhkan luka pada kulit, dan gangguan saluran pencernaan. Selain itu juga bersifat mengerutkan, mengeluarkan dahak, meluruhkan ludah, hemostatik, dan menghentikan pendarahan. Biasanya untuk obat hidung berdarah, dipakai 2 lembar daun segar Piper betle, dicuci, digulung kemudian dimasukkan ke dalam lubang hidung. Selain itu, kandungan bahan aktif fenol dan kavikol daun sirih hutan juga dapat dimanfaatkan sebagai pestisida nabati untuk mengendalikan hama penghisap.",
        "Kandungan daun pepermin yang utama adalah mentol, metil asetat, dan menthone. Tanaman ini telah digunakan untuk keperluan obat-obatan selama bertahun-tahun. Pepermin terkenal ampuh meredakan sakit perut, dan sering kali digunakan sebagai bahan utama dalam minuman hangat seperti teh. Pepermin juga merupakan obat ideal untuk menghilangkan rasa sakit kepala.",
        "Daunnya mengandung saponin, flavonoid polifenol dan minyak atsiri. Akarnya mengandung hidroksieugenol dan koniferil alkohol. Daun kenikir yang masih muda dan pucuknya dapat digunakan untuk sayuran, dimakan mentah-mentah dan direbus lalap. Masyarakat Jawa sudah biasa menggunakan sebagai salah satu pelengkap pecel. Sayuran ini dapat ditemui di pasar-pasar. Tumbuhan ini dapat digunakan untuk penyedap dan merangsang nafsu makan, memperbaiki peredaran darah dan mencuci darah, serta untuk menguatkan tulang, dan mengobati lemah lambung.",
        "Aromanya yang khas berasal dari sejumlah komponen mudah menguap dari minyak atsiri yang dikandung, paling tinggi pada buahnya yang dikeringkan. Kandungan utamanya adalah butilftalida dan butilidftalida sebagai pembawa aroma utama. Terdapat juga sejumlah flavonoid seperti graveobiosid A (1-2%)dan B (0,1 - 0,7%), serta senyawa golongan fenol. Komponen lainnya apiin, isokuersitrin, furanokumarin, serta isoimperatorin. Kandungan asam lemak utama dalah asam petroselin (40-60%). Daun dan tangkai daun mengandung steroid seperti stigmasterol dan sitosterol. Seledri adalah tumbuhan serbaguna, terutama sebagai sayuran dan obat-obatan. Sebagai sayuran, daun, tangkai daun, dan umbi sebagai campuran sup. Daun juga dipakai sebagai lalap, atau dipotong kecil-kecil lalu ditaburkan di atas sup bakso, soto, macam-macam sup lainnya, atau juga bubur ayam.",
        "Manfaat peterseli untuk kesehatan bisa kita peroleh berkat kandungan nutrisinya yang meliputi vitamin A, vitamin C, vitamin K, magnesium, zat besi, dan kalium. Selain itu, peterseli juga mengandung flavonoid dan karotenoid yang dapat melawan radikal bebas di dalam tubuh. Tanaman ini sebagai makanan banyak mengandung zat besi. Biasanya cocok digunakan dalam bahan makanan seperti pizza dan spaghetti.",
        "Jahe banyak mengandung vitamin C dan magnesium. Kandungan ini membuatnya membantu tubuh untuk memperkuat sistem imun. Selain kedua zat tersebut, jahe juga memiliki kandungan gingerols, shogaols, dan zingerones yang dapat berfungsi sebagai antioksidan bagi tubuh. Menurut jurnal dalam US National Library of Medicine National Institutes of Health - mengenai khasiat jahe, ternyata jahe memiliki potensi untuk mengobati sejumlah penyakit termasuk gangguan degeneratif (radang sendi dan rematik). Tak hanya itu saja, menurut jurnal di atas, jahe juga bisa mengatasi masalah pencernaan (sembelit dan maag), gangguan kardiovaskuler (aterosklerosis dan hipertensi), muntah, serta diabetes mellitus.",
        "Daun kemangi mengandung beberapa zat yang bermanfaat bagi tubuh, seperti vitamin A, B, C, betakaroten, kalsium, magnesium, fosfor, protein, karbohidrat, lemak, zat besi, flavonoid, arginin, anetol dan boron.  Aktivitas biologis dari komposisi dari senyawa–senyawa kimia yang terkandung dalam daun kemangi ditentukan oleh genotip, lingkungan serta tempat tumbuh dari tanaman tersebut. Daun kemangi sangat baik untuk melawan radikal bebas, karena memiliki antioksidan yang sangat baik untuk melawan radikal bebas yang masuk ke dalam tubuh. Daun kemangi dapat membantu pertumbuhan tulang. Hal ini disebabkan karena daun kemangi memiliki kandungan kalsium dan fosfor, yang memiliki peran penting untuk mengatur pembentukan dan pertumbuhan tulang.  Daun kemangi juga dapat berhasiat membantu melancarkan aliran darah dalam tubuh, karena mengandung magnesium yang dapat membantu merilekskan jantung dan juga pembuluh darah, sehingga menjaga aliran darah untuk tetap lancar. Daun ke\u00ADmangi memiliki kandungan betakaroten yang dapat meningkatkan respon antibodi, sehingga dapat meningkatkan kekebalan tubuh. Daun kemangi mengandung zat arginin yang dapat memperkuat daya hidup sperma sehingga dapat mencegah kemandulan. Selain itu, daun kemangi juga mengandung zat eugenol dan api\u00ADgenin fenkhona yang dapat membantu mening\u00ADkatkan kualitas ereksi dan mencegah ejakulasi dini. Daun kemangi dapat digunakan sebagai obat panu dengan cukup mudah. Caranya ambil segenggam daun kemangi dan cuci bersih, setelah itu haluskan. Beri sedikit air campuran kapur sirih dan selanjutnya balurkan pada bagian kulit yang terserang panu. Untuk hasil optimal sebaiknya dilakukan dua kali dalam sehari. Daun kemangi juga bermanfaat untuk melawan penyakit flu dan mual. Caranya yaitu pertama keringkan daun kemangi dan kemudian seduh layaknya teh. Minum air teh kemangi tersebut dua kali dalam sehari. Daun kemangi juga bagus untuk menghilangkan bau mulut, menghilangkan bau amis saat haid, serta dijadikan ramuan olesan untuk mengatasi perut kembung.",
        "Kandungan utama rimpang temu lawak adalah protein, karbohidrat, dan minyak atsiri yang terdiri atas kamfer, glukosida, turmerol, dan kurkumin. Kurkumin bermanfaat sebagai anti inflamasi (anti radang) dan anti hepototoksik (anti keracunan empedu). Temu lawak memiliki efek farmakologi yaitu hepatoprotektor (mencegah penyakit hati), menurunkan kadar kolesterol, antiinflamasi (antiradang), laxative (pencahar), diuretik (peluruh kencing), dan menghilangkan nyeri sendi. Manfaat lainnya yaitu, meningkatkan nafsu makan, melancarkan ASI, dan membersihkan darah. Rimpang temu lawak diekstrak untuk dibuat jamu godog/rebus. Rimpang ini mengandung 48 − 59,64 % zat tepung, 1,6 − 2,2 % kurkumin dan 1,48-1,63 % minyak asiri dan dipercaya dapat meningkatkan kerja ginjal serta anti inflamasi. Minuman ekstrak rimpang temu lawak berkarbonasi (limun temu lawak) juga dikenal di Indonesia, khususnya di Jawa. Minuman penyegar ini diproduksi mulai akhir dekade 1960-an dan mengalami kejayaan di sekitar 1970 sampai 1980-an. Rimpang temu lawak dimanfaatkan sebagai sumber karbohidrat dengan mengambil patinya, kemudian diolah menjadi bubur makanan untuk bayi dan orang-orang yang mengalami gangguan pencernaan. Pada sisi lain, temu lawak juga mengandung senyawa pengusir (repellant) nyamuk, karena tumbuhan tersebut menghasilkan minyak atsiri yang mengandung linalool, suatu geraniol yaitu golongan fenol yang tidak disukai nyamuk. Manfaat lain rimpang tanaman ini adalah sebagai obat jerawat, meningkatkan nafsu makan, antikolesterol, antiinflamasi, anemia, antioksidan, pencegah kanker, dan antimikroba.",
        "Rosmeri umumnya dikenal sebagai teh maupun bahan makanan.. Teh rosmarin dapat membantu mengatasi masalah reumatik dan gejala flu. Tanaman ini banyak mengandung kalsium, zat besi,dan Vitamin B6. Selain itu minyak essensial dari rosmeri juga memiliki kandungan anti bakteri terutama terhadap strain bakteri Escherichia coli, sehingga dapat digunakan untuk menyembuhkan sejumlah penyakit yang ditimbulkan akibat bakteri, misalnya pada gangguan saluran pernafasan, pencernaaan, saluran kencing, kulit, maupun untuk peralatan di rumah sakit Tanaman ini digunakan sebagai bumbu untuk daging, hidangan gurih, dan salad. Tanaman ini digunakan secara hati-hati dalam ramuan campuran karena aromanya yang intens. Kandungan minyak esensialnya digunakan dalam kosmetik dan beberapa produk farmasi.",
        "Daun lidah buaya mengandung senyawa-senyawa fitokimia yang sedang diteliti bioaktivitasnya, seperti senyawa manan terasetilasi, polimanan, antrakuinon C-glikosida, dan senyawa antrakuinon lain seperti emodin dan senyawa-senyawa lektin. Dua zat yang diambil dari lidah buaya digunakan dalam produk kesehatan komersial, yaitu gelnya yang tidak berwarna maupun lateksnya yang berwarna kuning. Gel lidah buaya digunakan untuk obat oles untuk berbagai gejala kulit, seperti luka bakar, luka, radang, radang dingin, psioriasis, Herpes labialis, atau kulit terlalu kering. Lateks lidah buaya dijadikan produk (baik bahan itu sendiri maupun digabungkan dengan bahan lain) untuk obat yang ditelan untuk menyembuhkan sembelit. Gel lidah buaya banyak ditambahkan dalam produk-produk komersial seperti yogurt, minuman, dan makanan-makanan manis. Jus lidah buaya sering dipromosikan manfaatnya untuk sistem pencernaan, tetapi penelitian ilmiah tidak menemukan bukti klaim ini dan badan-badan pengawas makanan dan obat-obatan juga belum ada yang menyetujui klaim tersebut. Lidah buaya digunakan dalam produk tisu wajah dan dipromosikan sebagai pelembap dan anti-radang untuk hidung. Perusahaan-perusahaan kosmetik menambahkan getah lidah buaya atau bahan-bahan turunan lainnya dalam produk-produk seperti makeup, tisu, pelembap, sabun, tabir surya, krim cukur, dan sampo. Sebuah tinjauan akademis menunjukkan bahwa bahan-bahan lidah buaya ditambahkan karena efeknya sebagai pelembap dan pelunak.",
        "Kelor kaya memiliki kandungan nutrisi dan senyawa yang dibutuhkan tubuh. Kelor mengandung antioksidan, vitamin, asam Amino Esensial, anti-inflammatory, dan kandungan senyawa lainnya. World Health Organization (WHO) menobatkan kelor sebagai pohon ajaib setelah melakukan studi dan menemukan bahwa tumbuhan ini berjasa sebagai penambah kesehatan berharga murah selama 40 tahun ini di negara-negara termiskin di dunia. Pohon kelor memang tersebar luas di padang-padang Afrika, Amerika Latin, dan Asia. National Institute of Health (NIH) pada 21 Maret 2008 mengatakan, bahwa pohon kelor telah digunakan sebagai obat oleh berbagai kelompok etnis asli untuk mencegah atau mengobati lebih dari 300 jenis penyakit. Tradisi pengobatan ayurveda India kuno menunjukkan bahwa 300 jenis penyakit dapat diobati dengan daun moringa oleifera. Dari hasil analisis kandungan nutrisi dapat diketahui bahwa daun kelor memiliki potensi yang sangat baik untuk melengkapi kebutuhan nutrisi dalam tubuh. Dengan mengonsumsi daun kelor maka keseimbangan nutrisi dalam tubuh akan terpenuhi sehingga orang yang mengonsumsi daun kelor akan terbantu untuk meningkatkan energi dan ketahanan tubuhnya. Selain itu, daun kelor juga berkhasiat untuk mengatasi berbagai keluhan yang diakibatkan karena kekurangan vitamin dan mineral seperti kekurangan vitamin A (gangguan penglihatan), kekurangan Choline (penumpukan lemak pada liver), kekurangan vitamin B1 (beri-beri), kekurangan vitamin B2 (kulit kering dan pecah-pecah), kekurangan vitamin B3 (dermatitis), kekurangan vitamin C (pendarahan gusi), kekurangan kalsium (osteoporosis), kekurangan zat besi (anemia), kekurangan protein (rambut pecah-pecah dan gangguan pertumbuhan pada anak)")

    private val toga_photo = intArrayOf(R.drawable.sirih_real,
        R.drawable.pepermin_real,
        R.drawable.kenikir_real,
        R.drawable.seledri_real,
        R.drawable.peterseli_real,
        R.drawable.jahe_real,
        R.drawable.kemangi_real,
        R.drawable.temulawak_real,
        R.drawable.rosemari_real,
        R.drawable.lidahbuaya_real,
        R.drawable.kelor_real)


    private val botanical_photo = intArrayOf(R.drawable.sirih,
        R.drawable.pepermin,
        R.drawable.kenikir,
        R.drawable.seledri,
        R.drawable.peterseli,
        R.drawable.jahe,
        R.drawable.kemangi,
        R.drawable.temulawak,
        R.drawable.rosemari,
        R.drawable.lidahbuaya,
        R.drawable.kelor)

    val listData: ArrayList<Toga>
        get() {
            val list = arrayListOf<Toga>()
            for (position in toga_nama_lokal.indices) {
                val toga = Toga()
                toga.nama_lokal = toga_nama_lokal[position]
                toga.nama_ilmiah = toga_nama_ilmiah[position]
                toga.photo = toga_photo[position]
                toga.botanical = botanical_photo[position]
                toga.khasiat = toga_khasiat[position]
                toga.desc =toga_desc[position]
                list.add(toga)
            }
            return list
        }


}