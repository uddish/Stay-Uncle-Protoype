package com.example.naman.stayuncleprototype;

/**
 * Created by Naman on 22-08-2016.
 */

public class Hotel_Details_POJO {

    public static class HotelDetails {
        String hotelName;
        String address;
        int imageId;
        int rent;
        //Temp name
        String name
        Boolean wifi;
        Boolean food;
        Boolean parking;
        Boolean swimming;
        Boolean ac;

        public HotelDetails(int imageId, String hotelName, String address,
                            Boolean wifi, Boolean food, Boolean parking, Boolean swimming, int rent) {
            this.hotelName = hotelName;
            this.address = address;
            this.imageId = imageId;
            this.wifi = wifi;
            this.food = food;
            this.parking = parking;
            this.swimming = swimming;
            this.rent = rent;
        }


        public String getHotelName() {
            return hotelName;
        }

        public String getAddress() {
            return address;
        }

        public int getImageId() {
            return imageId;
        }

        public Boolean getWifi() {
            return wifi;
        }

        public Boolean getFood() {
            return food;
        }

        public Boolean getParking() {
            return parking;
        }

        public Boolean getSwimming() {
            return swimming;
        }

        public Boolean getAc() {
            return ac;
        }

        public int getRent() {
            return rent;
        }
    }
}
