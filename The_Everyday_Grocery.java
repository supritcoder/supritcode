package com.pack1;

import java.util.Scanner;

public class The_Everyday_Grocery {
    static {
        System.out.println("^*WELCOME_TO_THE_EVERYDAY_GROCERY*^");
    }

    Scanner scan = new Scanner(System.in);
    int app_qty, ban_qty, mang_qty, orng_qty, guav_qty, oni_qty, pot_qty, tom_qty, carr_qty, mush_qty;//fruits& vegetable
    int app_t_val, ban_t_val, mang_t_val, orng_t_val, guav_t_val;//t_val for total value of fruits
    int oni_t_val, pot_t_val, tom_t_val, carr_t_val, mush_t_val;//t_val for total value of vegetable
    int mlk_qty, crd_qty, pnr_qty, bmlk_qty, che_qty, but_qty;//dairy product
    int mlk_t_val, crd_t_val, pnr_t_val, bmlk_t_val, che_t_val, but_t_val;//t_val for total value of dairy product
    int turm_qty, cum_qty, bpep_qty, rchil_qty, gmasala_qty, cmasala_qty;//spices
    int turm_t_val, cum_t_val, bpep_t_val, rchil_t_val, gmasala_t_val, cmasala_t_val;//t_val for total value of spices
    int dnamken_qty, bana_chps_qty, act_bis_qty, p_bar_qty, pc_bar_qty, mix_dryfrt_qty;//snacks
    int dnamken_t_val, bana_chps_t_val, act_bis_t_val, p_bar_t_val, pc_bar_t_val, mix_dryfrt_t_val;//t_val for total value of snacks

    int tpaste_qty, sgel_qty, perf_qty, fwash_qty, blotion_qty, choil_qty;//personal care
    int tpaste_t_val, sgel_t_val, perf_t_val, fwash_t_val, blotion_t_val, choil_t_val;//t_val for total value of personal care


    int choice, choice1, choice2, choice3, choice4, choice5;//choice used to 'choose' the item in switch case
    int check; //check used to 'check' if user enter an invalid option in main menu
    int repeat;//repeat used to 'repeat' the sub categories  and print a statement if user enter an invalid option
    int recheck;//recheck used to 'check' if user enter an invalid option in sub menu

    void store() {
       do {
            do {
                do {
                    if (check > 0 ) {
                        System.out.println("Invalid Choice Please Enter Again..!!");
                    }
                    check=1;


                    System.out.println("\t1.Fruits & Vegetables");
                    System.out.println("\t2.Dairy product");
                    System.out.println("\t3.spices");
                    System.out.println("\t4.Snacks");
                    System.out.println("\t5.Personal_care");
                    System.out.println("\t6.exit");
                    System.out.println("*^*^*^*^*^*^*^*^*");
                    System.out.println("Enter your choice-:");
                    choice = scan.nextInt();


                }
                while (choice < 1 || choice > 6);

                switch (choice) {

                    case 1: {
                        do {

                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("\t_*^\"Feel_The_Freshness\"*^_");
                            System.out.println("*^WELCOME_TO_FRUITS&VEGETABLE_SECTION*^");
                            System.out.println("PCODE\t\tPRODUCT\t\tQTY\t\tPRICE");
                            System.out.println("101\t\t\tApple\t\t1Kg\t\t150/-");
                            System.out.println("102\t\t\tBanana\t\t1Kg\t\t060/-");
                            System.out.println("103\t\t\tMango\t\t1Kg\t\t100/-");
                            System.out.println("104\t\t\tOrange\t\t1Kg\t\t120/-");
                            System.out.println("105\t\t\tGuava\t\t1Kg\t\t050/-");
                            System.out.println("106\t\t\tOnion\t\t1Kg\t\t040/-");
                            System.out.println("107\t\t\tPotato\t\t1Kg\t\t025/-");
                            System.out.println("108\t\t\tTomato\t\t1Kg\t\t030/-");
                            System.out.println("109\t\t\tCarrot\t\t1Kg\t\t060/-");
                            System.out.println("110\t\t\tMushroom\t1Kg\t\t070/-");
                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("*^^^^^^Enter_The_Product_Code^^^^^^* ");
                            do {

                                if (recheck > 0) {
                                    System.out.println("wrong input");
                                    System.out.println("Please enter a valid product code");
                                }
                                recheck=1;

                                choice1 = scan.nextInt();
                            }
                            while (choice1 < 101 || choice1 > 110);
                            switch (choice1) {
                                case 101: {
                                    System.out.println("How many kgs of \"APPLE\" do you need?");
                                    app_qty += scan.nextInt();
                                    app_t_val = app_qty * 150;

                                }
                                break;
                                case 102: {
                                    System.out.println("How many kgs of \"BANANA\" do you need?");
                                    ban_qty += scan.nextInt();
                                    ban_t_val = ban_qty * 60;
                                }
                                break;
                                case 103: {
                                    System.out.println("How many kgs of \"MANGO\" do you need?");
                                    mang_qty += scan.nextInt();
                                    mang_t_val = mang_qty * 100;
                                }
                                break;
                                case 104: {
                                    System.out.println("How many kgs of \"ORANGE\" do you need?");
                                    orng_qty += scan.nextInt();
                                    orng_t_val = orng_qty * 120;
                                }
                                break;
                                case 105: {
                                    System.out.println("How many kgs of \"GUAVA\" do you need?");
                                    guav_qty += scan.nextInt();
                                    guav_t_val = guav_qty * 50;
                                }
                                break;
                                case 106: {
                                    System.out.println("How many kgs of \"ONION\" do you need?");
                                    oni_qty += scan.nextInt();
                                    oni_t_val = oni_qty * 40;
                                }
                                break;
                                case 107: {
                                    System.out.println("How many kgs of \"POTATO\" do you need?");
                                    pot_qty += scan.nextInt();
                                    pot_t_val = pot_qty * 25;
                                }
                                break;
                                case 108: {
                                    System.out.println("How many kgs of \"TOMATO\" do you need?");
                                    tom_qty += scan.nextInt();
                                    tom_t_val = tom_qty * 30;
                                }
                                break;
                                case 109: {
                                    System.out.println("How many kgs of \"CARROT\" do you need?");
                                    carr_qty += scan.nextInt();
                                    carr_t_val = carr_qty * 60;
                                }
                                break;
                                case 110: {
                                    System.out.println("How many kgs of \"MUSHROOM\" do you need?");
                                    mush_qty += scan.nextInt();
                                    mush_t_val = mush_qty * 70;
                                }
                                break;
                            }
                            System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                            repeat = scan.nextInt();
                            recheck=0;
                            if (repeat>3)
                            {
                                System.out.println("invalid input");
                                System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                                repeat= scan.nextInt();
                            }

                        }
                        while (repeat == 1);


                    }
                    break;

                    case 2: {
                        do {


                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("\t\t\t*\"Fresh_Pure_Yummy\"*");
                            System.out.println("*_*^WELCOME_TO_DAIRY_PRODUCT_SECTION*^_*");
                            System.out.println("PCODE\t\tPRODUCT\t\tQTY\t\t\tPRICE");
                            System.out.println("201\t\t\tMilk\t\t1Packet\t\t28/-");
                            System.out.println("202\t\t\tCurd\t\t1Packet\t\t40/-");
                            System.out.println("203\t\t\tPaneer\t\t1Packet\t\t90/-");
                            System.out.println("204\t\t\tButtermik\t1Packet\t\t20/-");
                            System.out.println("205\t\t\tCheese\t\t1Packet\t\t100/-");
                            System.out.println("206\t\t\tButter\t\t1Packet\t\t60/-");
                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("*^^^^^^^^^Enter_The_Product_Code^^^^^^^^*");
                            do {
                                if (recheck > 0) {
                                    System.out.println("wrong input");
                                    System.out.println("Please enter a valid product code");
                                }
                                recheck=1;

                                choice2 = scan.nextInt();
                            }
                            while (choice2 < 201 || choice2 > 206);
                            switch (choice2) {
                                case 201: {
                                    System.out.println("How many packet of \"MILK\" do you need?");
                                    mlk_qty += scan.nextInt();
                                    mlk_t_val = mlk_qty * 28;
                                }
                                break;
                                case 202: {
                                    System.out.println("How many packet of \"CURD\" do you need?");
                                    crd_qty += scan.nextInt();
                                    crd_t_val = crd_qty * 40;
                                }
                                break;
                                case 203: {
                                    System.out.println("How many packet of \"PANEER\" do you need?");
                                    pnr_qty += scan.nextInt();
                                    pnr_t_val = pnr_qty * 90;
                                }
                                break;
                                case 204: {
                                    System.out.println("How many packet of \"BUTTERMILK\" do you need?");
                                    bmlk_qty += scan.nextInt();
                                    bmlk_t_val = bmlk_t_val * 20;
                                }
                                break;
                                case 205: {
                                    System.out.println("How many packet of \"CHEESE\" do you need?");
                                    che_qty += scan.nextInt();
                                    che_t_val = che_qty * 100;
                                }
                                break;

                                case 206: {
                                    System.out.println("How many packet of \"BUTTER\" do you need?");
                                    but_qty += scan.nextInt();
                                    but_t_val = but_qty * 60;
                                }
                                break;
                            }
                            System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                            repeat = scan.nextInt();
                            recheck=0;
                            if (repeat>3)
                            {
                                System.out.println("invalid input");
                                System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                                repeat= scan.nextInt();
                            }



                        }
                        while (repeat == 1);
                    }
                    break;
                    case 3: {
                        do {


                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("\t\t*\"For_The_Spicy_Side_Of_Yours\"*");
                            System.out.println("\t\t*^WELCOME_TO_SPICES_SECTION*^");
                            System.out.println("PCODE\tPRODUCT\t\t\t\t\tQUANTITY\tPRICE");
                            System.out.println("301\t\tTurmeric_Powder\t\t\t1Packet\t\t20/-");
                            System.out.println("302\t\tCumin_Powder\t\t\t1Packet\t\t20/-");
                            System.out.println("303\t\tBlack_pepper_Powder\t\t1Packet\t\t40/-");
                            System.out.println("304\t\tRed_Chilli Powder\t\t1Packet\t\t30/-");
                            System.out.println("305\t\tGaram_Masala_Powder\t\t1Packet\t\t40/-");
                            System.out.println("306\t\tChicken_Masala_Powder\t1Packet\t\t80/-");
                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("*^^^^^^^^^^^Enter_The_Product_Code^^^^^^^^^^^^*");


                            do {
                                if (recheck > 0) {
                                    System.out.println("wrong input");
                                    System.out.println("Please enter a valid product code");
                                }
                                recheck=1;
                                choice3 = scan.nextInt();
                            }
                            while (choice3 < 301 || choice3 > 306);
                            switch (choice3) {
                                case 301: {
                                    System.out.println("How many packet of \"Turmeric_Powder\" do you need?");
                                    turm_qty += scan.nextInt();
                                    turm_t_val = turm_qty * 20;
                                }
                                break;
                                case 302: {
                                    System.out.println("How many packet of \"Cumin_Powder\" do you need?");
                                    cum_qty += scan.nextInt();
                                    cum_t_val = cum_qty * 20;
                                }
                                break;
                                case 303: {
                                    System.out.println("How many packet of \"Black_Pepper_Powder\" do you need?");
                                    bpep_qty += scan.nextInt();
                                    bpep_t_val = bpep_qty * 40;
                                }
                                break;
                                case 304: {
                                    System.out.println("How many packet of \"Red_Chilli_Powder\" do you need?");
                                    rchil_qty += scan.nextInt();
                                    rchil_t_val = rchil_qty * 30;
                                }
                                break;
                                case 305: {
                                    System.out.println("How many packet of \"Garam_Masala_Powder\" do you need?");
                                    gmasala_qty += scan.nextInt();
                                    gmasala_t_val = gmasala_qty * 40;
                                }
                                break;
                                case 306: {
                                    System.out.println("How many packet of \"Chicken_Masala_Powder\" do you need?");
                                    cmasala_qty += scan.nextInt();
                                    cmasala_t_val = cmasala_qty * 80;
                                }
                                break;

                            }
                            System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                            repeat = scan.nextInt();
                            recheck=0;
                            if (repeat>3)
                            {
                                System.out.println("invalid input");
                                System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                                repeat= scan.nextInt();
                            }
                            

                        }
                        while (repeat == 1);
                    }
                    break;
                    case 4: {
                        do {


                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("\t\t\t*\"Healthy_Life_With_Healthy_Snacks\"*");
                            System.out.println("\t\t\t*^WELCOME_TO_SNACKS_SECTION*^");
                            System.out.println("PCODE\t\tPRODUCT\t\t\t\tQUANTITY\t\tPRICE");
                            System.out.println("401\t\tDiet_Namkeen\t\t\t1Pkt(500grm)\t200/-");
                            System.out.println("402\t\tBanana_Chip \t\t\t1Pkt(100grm)\t30/-");
                            System.out.println("403\t\tActive_Oats_Biscuit\t\t1Pkt(300grm)\t120/-");
                            System.out.println("404\t\tProtein_Bar\t\t\t\t1Pkt(pack_of 6)\t120/-");
                            System.out.println("405\t\tPeanut_Candy_Bar\t\t1Pkt(pack_of 9)\t100/-");
                            System.out.println("406\t\tMix_DryFruits\t\t\t1Pkt(1kg)\t\t500/-");
                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("*^^^^^^^^^^^^^^Enter_The_Product_Code^^^^^^^^^^^^^^*");
                            do {
                                if (recheck > 0) {
                                    System.out.println("wrong input");
                                    System.out.println("Please enter a valid product code");
                                }
                                recheck=1;
                                choice4 = scan.nextInt();
                            }
                            while (choice4 < 401 || choice4 > 406);
                            switch (choice4) {
                                case 401: {
                                    System.out.println("How many packets of \"DIET_NAMKEEN\" do you need?");
                                    dnamken_qty += scan.nextInt();
                                    dnamken_t_val = dnamken_t_val * 200;
                                }
                                break;
                                case 402: {
                                    System.out.println("How many packets of \"BANANA_CHIPS\" do you need?");
                                    bana_chps_qty += scan.nextInt();
                                    bana_chps_t_val = bana_chps_qty * 30;
                                }
                                break;
                                case 403: {
                                    System.out.println("How many packets of \"ACTIVE_OATS_BISCUITS\" do you need?");
                                    act_bis_qty += scan.nextInt();
                                    act_bis_t_val = act_bis_qty * 120;
                                }
                                break;
                                case 404: {
                                    System.out.println("How many packets of \"PROTEIN_BAR\" do you need?");
                                    p_bar_qty += scan.nextInt();
                                    p_bar_t_val = p_bar_qty * 120;
                                }
                                break;
                                case 405: {
                                    System.out.println("How many packets of \"PEANUT_CANDY_BAR\" do you need?");
                                    pc_bar_qty += scan.nextInt();
                                    pc_bar_t_val = pc_bar_qty * 100;
                                }
                                break;
                                case 406: {
                                    System.out.println("How many packets of \"MIX_DRY_FRUITS\" do you need?");
                                    mix_dryfrt_qty += scan.nextInt();
                                    tom_t_val = tom_qty * 30;
                                }
                                break;
                            }
                            System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                            repeat = scan.nextInt();
                            recheck=0;
                            if (repeat>3)
                            {
                                System.out.println("invalid input");
                                System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                                repeat= scan.nextInt();
                            }

                        }
                        while (repeat == 1);

                    }
                    break;
                    case 5: {
                        do {


                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("\t\t*\"Premium_Care_Personal_Touch\"*");
                            System.out.println("\t*^WELCOME_TO_PERSONALCARE_SECTION*^");
                            System.out.println("PCODE\tPRODUCT\t\t\t\tQUANTITY\tPRICE");
                            System.out.println("501\t\tToothpaste\t\t\t1Pack\t\t60/-");
                            System.out.println("502\t\tShowergel\t\t\t1Pack\t\t120/-");
                            System.out.println("503\t\tPerfume\t\t\t\t1Pack\t\t250/-");
                            System.out.println("504\t\tFacewash\t\t\t1Pack\t\t150/-");
                            System.out.println("505\t\tBody_lotion\t\t\t1Pack\t\t120/-");
                            System.out.println("506\t\tCoconut_hair_oil\t1Pack\t\t80/-");
                            System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
                            System.out.println("*^^^^^^^^^^^Enter_The_Product_Code^^^^^^^^^^^^^*");
                            do {
                                if (recheck > 0) {
                                    System.out.println("wrong input");
                                    System.out.println("Please enter a valid product code");
                                }
                                recheck=1;
                                choice5 = scan.nextInt();
                            }
                            while (choice5 < 501 || choice5 > 506);
                            switch (choice5) {
                                case 501: {
                                    System.out.println("How many Pack of \"TOOTHPASTE\" do you need?");
                                    tpaste_qty += scan.nextInt();
                                    tpaste_t_val = tpaste_qty * 60;
                                }
                                break;
                                case 502: {
                                    System.out.println("How many pack of \"SHOWERGEL\" do you need?");
                                    sgel_qty += scan.nextInt();
                                    sgel_t_val = sgel_qty * 120;
                                }
                                break;
                                case 503: {
                                    System.out.println("How many pack of \"PERFUME\" do you need?");
                                    perf_qty += scan.nextInt();
                                    perf_t_val = perf_qty * 250;
                                }
                                break;
                                case 504: {
                                    System.out.println("How many pack of \"FACEWASH\" do you need?");
                                    fwash_qty += scan.nextInt();
                                    oni_t_val = oni_qty * 150;
                                }
                                break;
                                case 505: {
                                    System.out.println("How many pack of \"BODYLOTION\" do you need?");
                                    blotion_qty += scan.nextInt();
                                    blotion_t_val = blotion_qty * 120;
                                }
                                break;
                                case 506: {
                                    System.out.println("How many pack of \"COCONUT_HAIR_OIL\" do you need?");
                                    choil_qty += scan.nextInt();
                                    choil_t_val = choil_qty * 80;
                                }
                                break;
                            }

                            System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                            repeat = scan.nextInt();
                            recheck=0;
                            if (repeat>3)
                            {
                                System.out.println("invalid input");
                                System.out.println("\"ENTER\"\n" + "1 for previous menu \n" + "2 for main menu\n" + "3 for exit\n");
                                repeat= scan.nextInt();
                            }
                            

                        }
                        while (repeat == 1);
                    }
                    break;
                    case 6:
                        repeat =0;
                        break;


                }

                check=0;


            }

            while (repeat == 2);

        }
        while (repeat == 1);

    }

    public static void main(String[] args) {
        The_Everyday_Grocery assign = new The_Everyday_Grocery();
        assign.store();
        long Final_bill;
        long Tot_Final_bill;
        long Final_bill_fruit;
        long Final_bill_vegetable;
        long Final_bill_Dairy;
        long Final_bill_Spice;
        long Final_bill_Snack;
        long Final_bill_Pcare;
        long discount;
        Final_bill_fruit = assign.app_t_val + assign.ban_t_val + assign.mang_t_val + assign.orng_t_val + assign.guav_t_val;
        Final_bill_vegetable = assign.oni_t_val + assign.pot_t_val + assign.tom_t_val + assign.carr_t_val + assign.mush_t_val;
        Final_bill_Dairy = assign.mlk_t_val + assign.crd_t_val + assign.pnr_t_val + assign.bmlk_t_val + assign.che_t_val + assign.but_t_val;
        Final_bill_Spice = assign.turm_t_val + assign.cum_t_val + assign.bpep_t_val + assign.rchil_t_val + assign.gmasala_t_val + assign.cmasala_t_val;
        Final_bill_Snack = assign.dnamken_t_val + assign.bana_chps_t_val + assign.act_bis_t_val + assign.p_bar_t_val + assign.pc_bar_t_val + assign.mix_dryfrt_t_val;
        Final_bill_Pcare = assign.tpaste_t_val + assign.sgel_t_val + assign.perf_t_val + assign.fwash_t_val + assign.blotion_t_val + assign.choil_t_val;
        Final_bill = Final_bill_fruit + Final_bill_vegetable + Final_bill_Dairy + Final_bill_Spice + Final_bill_Snack + Final_bill_Pcare;
        Scanner scan1 = new Scanner(System.in);
        if(Final_bill>0) {
            System.out.println("Please provide your details for billing");
            System.out.println("Enter your Name:");
            String name = scan1.nextLine();
            System.out.println("Enter your Address");
            String address = scan1.nextLine();
            System.out.println("Enter your Mobilenumber");
            String phno = scan1.nextLine();

            System.out.println("==========THE_EVERYDAY_GROCERY===========");
            System.out.println("=============FINAL_BILL==================");
            System.out.println("Name-" + name);
            System.out.println("Address-" + address);
            System.out.println("Phonenumber-" + phno);
            System.out.println("=========================================");
        }



        if (assign.app_t_val >= 1) {
            System.out.println("Apple\t" + assign.app_qty + "x150=" + assign.app_t_val);
        }
        if (assign.ban_t_val >= 1) {
            System.out.println("Banana\t" + assign.ban_qty + "x60=" + assign.ban_t_val);
        }
        if (assign.mang_t_val >= 1) {
            System.out.println("Mango\t" + assign.mang_qty + "x100=" + assign.mang_t_val);
        }
        if (assign.orng_t_val >= 1) {
            System.out.println("Orange\t" + assign.orng_qty + "x120=" + assign.orng_t_val);
        }
        if (assign.guav_t_val >= 1) {
            System.out.println("Guava\t" + assign.guav_qty + "x50=" + assign.guav_t_val);
        }
        if (assign.oni_t_val >= 1) {
            System.out.println("Onion\t" + assign.oni_qty + "x40=" + assign.oni_t_val);
        }
        if (assign.pot_t_val >= 1) {
            System.out.println("Potato\t" + assign.pot_qty + "x25=" + assign.pot_t_val);
        }
        if (assign.tom_t_val >= 1) {
            System.out.println("Tomato\t" + assign.tom_qty + "x30=" + assign.tom_t_val);
        }
        if (assign.carr_t_val >= 1) {
            System.out.println("Carrot\t" + assign.carr_qty + "x60=" + assign.carr_t_val);
        }
        if (assign.mush_t_val >= 1) {
            System.out.println("Mushroom\t" + assign.mush_qty + "x70=" + assign.mush_t_val);
        }
        if (assign.mlk_t_val >= 1) {
            System.out.println("Milk\t" + assign.mlk_qty + "x28=" + assign.mlk_t_val);
        }
        if (assign.crd_t_val >= 1) {
            System.out.println("Curd\t" + assign.crd_qty + "x40=" + assign.crd_t_val);
        }
        if (assign.pnr_t_val >= 1) {
            System.out.println("Paneer\t" + assign.pnr_qty + "x90=" + assign.pnr_t_val);
        }
        if (assign.bmlk_t_val >= 1) {
            System.out.println("Buttermilk\t" + assign.bmlk_qty + "x20=" + assign.bmlk_t_val);
        }
        if (assign.che_t_val >= 1) {
            System.out.println("Cheese\t" + assign.che_qty + "x100=" + assign.che_t_val);
        }
        if (assign.but_t_val >= 1) {
            System.out.println("Butter\t" + assign.but_qty + "x60=" + assign.but_t_val);
        }
        if (assign.turm_t_val >= 1) {
            System.out.println("Turmeric_Powder\t" + assign.turm_qty + "x20=" + assign.turm_t_val);
        }
        if (assign.cum_t_val >= 1) {
            System.out.println("Cumin_Powder\t" + assign.cum_qty + "x20=" + assign.cum_t_val);
        }
        if (assign.bpep_t_val >= 1) {
            System.out.println("Black_Pepper_Powder\t" + assign.bpep_qty + "x40=" + assign.bpep_t_val);
        }
        if (assign.rchil_t_val >= 1) {
            System.out.println("Red_Chilli_Powder\t" + assign.rchil_qty + "x30=" + assign.rchil_t_val);
        }
        if (assign.gmasala_t_val >= 1) {
            System.out.println("Garam_Masala_Powder\t" + assign.gmasala_qty + "x40=" + assign.gmasala_t_val);
        }
        if (assign.cmasala_t_val >= 1) {
            System.out.println("Chicken_Masala_Powder\t" + assign.cmasala_qty + "x80=" + assign.cmasala_t_val);
        }
        if (assign.dnamken_t_val >= 1) {
            System.out.println("Diet_Namkeen\t" + assign.dnamken_qty + "x200=" + assign.dnamken_t_val);
        }
        if (assign.bana_chps_t_val >= 1) {
            System.out.println("Banana_Chips\t" + assign.bana_chps_qty + "x30=" + assign.bana_chps_t_val);
        }
        if (assign.act_bis_t_val >= 1) {
            System.out.println("Active_Oats_Biscuit\t" + assign.act_bis_qty + "x120=" + assign.act_bis_t_val);
        }
        if (assign.p_bar_t_val >= 1) {
            System.out.println("Protein_Bar\t" + assign.p_bar_qty + "x120=" + assign.p_bar_t_val);
        }
        if (assign.pc_bar_t_val >= 1) {
            System.out.println("Peanut_Candy_Bar\t" + assign.pc_bar_qty + "x100=" + assign.pc_bar_t_val);
        }
        if (assign.mix_dryfrt_t_val >= 1) {
            System.out.println("Mix_Dryfruits\t" + assign.mix_dryfrt_qty + "x500=" + assign.mix_dryfrt_t_val);
        }
        if (assign.tpaste_t_val >= 1) {
            System.out.println("Toothpaste\t" + assign.tpaste_qty + "x60=" + assign.tpaste_t_val);
        }
        if (assign.sgel_t_val >= 1) {
            System.out.println("Showergel\t" + assign.sgel_qty + "x120=" + assign.sgel_t_val);
        }
        if (assign.perf_t_val >= 1) {
            System.out.println("Perfume\t" + assign.perf_qty + "x250=" + assign.perf_t_val);
        }
        if (assign.fwash_t_val >= 1) {
            System.out.println("Fashwash\t" + assign.fwash_qty + "x150=" + assign.fwash_t_val);
        }
        if (assign.blotion_t_val >= 1) {
            System.out.println("Bodylotion\t" + assign.blotion_qty + "x120=" + assign.blotion_t_val);
        }
        if (assign.choil_t_val >= 1) {
            System.out.println("coconut hair oil\t" + assign.choil_qty + "x80=" + assign.choil_t_val);
        }

        if (Final_bill >= 500) {
            discount = (Final_bill * 5) / 100;
            Tot_Final_bill = Final_bill - discount;
            System.out.println("Total Bill-\t" + Final_bill);
            System.out.println("You recive a discount of-5%\t" + discount);
            System.out.println("Final Bill-\t" + Tot_Final_bill);
            System.out.println("====Thank You For Sopping You saved " + discount + "=====");

        } else
            System.out.println("TOTAL-\t" + Final_bill);

        System.out.println("=============VISIT_AGAIN=================");
        System.out.println("==========JAVA IS AWESOME=====");
    }
}
