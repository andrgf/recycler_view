package com.example.indonesiafood

object FoodData {

    private val foodNames = arrayOf(
        "Rendang",
        "Bakso",
        "Gudeg",
        "Lumpia",
        "Nasi Liwet",
        "Pempek",
        "Rawon",
        "Sate Lilit",
        "Nasi Goreng",
        "Tengkleng"
    )

    private val foodDetail = arrayOf(
        "Rendang adalah masakan daging yang berasal dari Minangkabau Sumatra Barat Indonesia. Proses memasak rendang dengan suhu rendah dalam waktu lama, menggunakan santan dan aneka rempah-rempah khas indonesia yang sedikit pedas sehingga menambah ke khas an dan kelezatannya.",
        "Bakso merupakan campuran daging sapi giling yang dicampur tepung tapioca dan dibentuk mirip bola-bola kecil ,biasanya menggunakan daging sapi tapi banyak juga yang menggunakan  daging ikan,ayam,udang,kerbau . Bakso disajikan dalam keadaan panas dengan kuah bening biasanya juga di tambahkan mie dan bihun serta telur kemudian di taburi bawang goreng.",
        "Gudeg adalah makanan yang terbuat dari nangka muda mentah (Jawa: gori). Perlu waktu berjam-jam untuk membuatnya. Gudeng dimasak dengan gula aren, dan santan rempah-rempah tambahan termasuk bawang putih, bawang merah, kemiri, biji ketumbar, lengkuas, daun salam, dan daun jati, yang memberikan warna coklat kemerahan ke masakan.. Masakan ini merupakan masakan tradisional dan khas Provinsi Yogyakarta dan Jawa Tengah Indonesia.",
        "Lumpia merupakan jajanan tradisional khas Tionghoa dan merupakan kuliner khas dari Semarang. Selain rasanya yang enak dan murah, lumpia juga memiliki isian yang sehat, biasanya terdiri dari sayuran segar, rebung, telur, daging, maupun makanan laut",
        "Nasi liwet adalah cara memasak nasi tradisional Jawa dengan santan. Ada juga varian nasi liwet ala Sunda yang berbeda rasa dan penyajiannya. Nasi liwet Jawa yang disajikan dengan santan kental, suwiran ayam dan telur. nasi dimasak dalam santan, disajikan dengan berbagai lauk pauk.",
        "Pempek adalah makanan olahan daging ikan yang digiling dengan tepung kanji. Makanan ini biasanya disajikan dengan kuah pempek atau cuko. Rasanya enak dan gurih. Ciri khas kuliner Palembang kebanyakan menggunakan ikan sebagai bahan utama.",
        "Rawon  merupakan  kuliner khas Jawa Timur, berupa sup daging dengan kuah berwarna hitam. Warna hitam dari kuah Rawon berasal dari buah kepayang atau sering disebut dengan kluwak.",
        "Sate Lilit adalah sebuah varian sate asal Bali. Sate ini terbuat dari daging babi, ikan, ayam, daging sapi, atau bahkan kura-kura yang dicincang, kemudian dicampur dengan parutan kelapa, santan, jeruk nipis, bawang merah, dan merica. Daging cincang yang telah berbumbu dilekatkan pada sebuah bambu atau tebu, kemudian dipanggang di atas arang.",
        "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",
        "Tengkleng adalah masakan sejenis sup dengan bahan utama tulang kambing. Sejarah tengkleng konon menurut para tetua di kota Solo hanya para bangsawan dan orang-orang Belanda saja yang bisa menikmati masakan daging kambing."
    )

    private val foodImage = intArrayOf(
        R.drawable.rendang,
        R.drawable.bakso,
        R.drawable.gudeg,
        R.drawable.lumpia,
        R.drawable.nasi_liwet,
        R.drawable.pempek,
        R.drawable.rawon,
        R.drawable.sate_lilit,
        R.drawable.nasigoreng,
        R.drawable.tengkleng
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetail[position]
                food.photo = foodImage[position]
                list.add(food)
            }
            return list
        }
}