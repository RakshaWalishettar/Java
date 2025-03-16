class Array {
    public static void main(String[] args) {
        System.out.println("Hotel Name");
        String hotel1 = "Shiva Darshini";
        String hotel2 = "Swati Hotel";
        String hotel3 = "Chikpete Donne Biryani";
        String hotel4 = "Fresh Menu";
        String hotel5 = "Krishna Vaibhav Hotel";
        String hotel6 = "Mallana Hotel";
        String hotel7 = "Guru Kotterswar Benne Dosa Hotel";
        String hotel8 = "Green Court";
        String hotel9 = "Jannata Hotel";
        String hotel10 = "Bharani";

        String[] hotels = {hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8, hotel9, hotel10};
        for (String ref : hotels) {
            System.out.println(ref);
        }
		System.out.println("\n");

        System.out.println("Pincode");
        int pincode1 = 581110;
        int pincode2 = 530068;
        int pincode3 = 577004;
        int pincode4 = 580009;
        int pincode5 = 570001;
        int pincode6 = 562101;
        int pincode7 = 577101;
        int pincode8 = 580001;
        int pincode9 = 591126;
        int pincode10 = 584101;

        int[] pincodes = {pincode1, pincode2, pincode3, pincode4, pincode5, pincode6, pincode7, pincode8, pincode9, pincode10};
        for (int ref : pincodes) {
            System.out.println(ref);
        }
		System.out.println("\n");

        System.out.println("Laptop Brand");
        String brand1 = "Dell";
        String brand2 = "Lenovo";
        String brand3 = "Samsung";
        String brand4 = "Asus";
        String brand5 = "Acer";
        String brand6 = "Apple";
        String brand7 = "LG";
        String brand8 = "Toshiba";
        String brand9 = "HP";
        String brand10 = "Intel";

        String[] brands = {brand1, brand2, brand3, brand4, brand5, brand6, brand7, brand8, brand9, brand10};
        for (String ref : brands) {
            System.out.println(ref);
        }
		System.out.println("\n");

        System.out.println("Chars");
        char c1 = 'A';
        char c2 = 'L';
        char c3 = 'S';
        char c4 = 'B';
        char c5 = 'C';
        char c6 = 'P';
        char c7 = 'G';
        char c8 = 'T';
        char c9 = 'H';
        char c10 = 'I';

        char[] chars = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
        for (char ref : chars) {  // Corrected loop
            System.out.println(ref);
        }
		System.out.println("\n");

        System.out.println("Temples");
        String temple1 = "Dharmasthala";
        String temple2 = "Udupi Krishna";
        String temple3 = "Kateel Durga Parameshwari";
        String temple4 = "Mysore Chamundeshwari";
        String temple5 = "Nanjundeshwara";
        String temple6 = "Subramanya";
        String temple7 = "Sirsi Marikamba";
        String temple8 = "Kashi Vishwanath";
        String temple9 = "Tirupati";
        String temple10 = "Kollur Mookambika";

        String[] temples = {temple1, temple2, temple3, temple4, temple5, temple6, temple7, temple8, temple9, temple10};
        for (String ref : temples) {
            System.out.println(ref);
        }
		System.out.println("\n");

        System.out.println("Food variety");

        String[] foodVariety1 = {"Naan", "Chapati", "Paratha", "Papadam", "Samosa", "Chaats", "Pani Puri", "Bhelpuri", "Kachori", "Chole Bhature"};
        String[] foodVariety2 = {"Matar Kulcha", "Dosa", "Vada Pav", "Misal Pav", "Kathi Rolls", "Frankie", "Pakora", "Gobi Manchurian", "Chicken 65", "Momos"};
        String[] foodVariety3 = {"Sambar", "Medu Vada", "Tandoori", "Tikka Masala", "Butter Chicken", "Korma", "Malai Kofta", "Vindaloo", "Rogan Josh", "Karaikudi Curry"};
        String[] foodVariety4 = {"Saag", "Dal Tadka", "Chana Masala", "Aloo Gobi", "Biryani", "Kadai Chicken", "Thali", "Gajar Ka Halwa", "Kulfi", "Kheer"};
        String[] foodVariety5 = {"Gulab Jamun", "Ras Malai", "Barfi", "Mysore Pak", "Lassi", "Masala Chaas", "Masala Chai", "Jal Jeera", "Aam Panna", "Rasgulla"};

        // 2D Array to store all food varieties
        String[][] foodVarieties = {foodVariety1, foodVariety2, foodVariety3, foodVariety4, foodVariety5};

        // Print all food varieties
        for (String[] category : foodVarieties) {
            for (String food : category) {
                System.out.println(food);
            }
        }
    }
}
