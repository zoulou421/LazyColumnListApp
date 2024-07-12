package com.formationkilo.lazycolumlistapp

data class MarvelChar(
    var charName:String,
    var name:String,
    var imageRes:Int
)

fun getAllMarvelChars():List<MarvelChar>{
    return listOf(
        MarvelChar("BEBY","Believe in God",R.drawable.pic_pic_pixel_2_api_24),
        MarvelChar("BONEVY.","Believe in you",R.drawable.pic_pac_pixel_2_api_24),
        MarvelChar("LAURORE","Life is so sweet.God can make it",R.drawable.pic_piu_pixel_2_api_24),

        MarvelChar("BEBY","Believe in God",R.drawable.pic_pic_pixel_2_api_24),
        MarvelChar("BONEVY.","Believe in you",R.drawable.pic_pac_pixel_2_api_24),
        MarvelChar("LAURORE","Life is so sweet.God can make it",R.drawable.pic_piu_pixel_2_api_24),

        MarvelChar("BEBY","Believe in God",R.drawable.pic_pic_pixel_2_api_24),
        MarvelChar("BONEVY.","Believe in you",R.drawable.pic_pac_pixel_2_api_24),
        MarvelChar("LAURORE","Life is so sweet.God can make it",R.drawable.pic_piu_pixel_2_api_24),

        MarvelChar("BEBY","Believe in God",R.drawable.pic_pic_pixel_2_api_24),
        MarvelChar("BONEVY.","Believe in you",R.drawable.pic_pac_pixel_2_api_24),
        MarvelChar("LAURORE","Life is so sweet.God can make it",R.drawable.pic_piu_pixel_2_api_24),

        MarvelChar("BEBY","Believe in God",R.drawable.pic_pic_pixel_2_api_24),
        MarvelChar("BONEVY.","Believe in you",R.drawable.pic_pac_pixel_2_api_24),
        MarvelChar("LAURORE","Life is so sweet.God can make it",R.drawable.pic_piu_pixel_2_api_24),

    )
}