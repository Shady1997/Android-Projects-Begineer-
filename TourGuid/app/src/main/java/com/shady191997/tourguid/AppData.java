package com.shady191997.tourguid;

public class AppData {
    // data to use in app include location names and pictures in cairo
    private final String[] locations_names = {"Restaurants", "Mosques","Museums","Markets"};
    private final Integer[] locations_imgs = {R.drawable.resturant,R.drawable.mosque,R.drawable.museum,R.drawable.market};

    //restaurants
    private final String[] restaurants_names ={"Vivo Restaurant","Dj Restaurant"};
    private final Integer[] restaurants_imgs = {R.drawable.resurant_vivo,R.drawable.resurant_dj};

    //museums
    private final String[] museums_names ={"Egyption Museum"};
    private final Integer[] museums_imgs = {R.drawable.museum_cairo};

    //mosques
    private final String[] mosques_names ={"Mohamed Ali Mosque","AL Azhar Mosque"};
    private final Integer[] mosques_imgs = {R.drawable.mosque_mohamed_ali,R.drawable.mosque_azhar};

    //markets
    private final String[] markets_names ={"Khan El Khalily"};
    private final Integer[] markets_imgs = {R.drawable.market_khan};



    public String[] getLocations_names() {
        return locations_names;
    }

    public Integer[] getLocations_imgs() {
        return locations_imgs;
    }

    public String[] getRestaurants_names() {
        return restaurants_names;
    }

    public Integer[] getRestaurants_imgs() {
        return restaurants_imgs;
    }

    public String[] getMuseums_names() {
        return museums_names;
    }

    public Integer[] getMuseums_imgs() {
        return museums_imgs;
    }

    public String[] getMosques_names() {
        return mosques_names;
    }

    public Integer[] getMosques_imgs() {
        return mosques_imgs;
    }

    public String[] getMarkets_names() {
        return markets_names;
    }

    public Integer[] getMarkets_imgs() {
        return markets_imgs;
    }



}
