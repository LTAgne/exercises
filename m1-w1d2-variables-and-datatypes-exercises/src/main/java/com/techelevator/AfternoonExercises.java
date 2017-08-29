package com.techelevator;

public class AfternoonExercises {

	public static void main(String[] args) {
        
       
		/*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		int birdsOnBranch = 4; 
		birdsOnBranch --;
		System.out.println(birdsOnBranch);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
        int birds = 6;
        int numberOfNests = 3;
        int extraBirds = birds - numberOfNests;
        System.out.println(extraBirds);
       
        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
        int raccoons = 3; 
        System.out.println(raccoons - 2);
      
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
        int flowers = 5;
        int bees = 3;
        System.out.println(flowers - bees);
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
        int pigeonTotal = 1;
        pigeonTotal ++;
        System.out.println(pigeonTotal);
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
        int owlsOnFence = 3;
        owlsOnFence = owlsOnFence + 2;
        System.out.println(owlsOnFence);

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
         int beavers = 2;
         beavers --;
         System.out.println(beavers);
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
         int toucans = 2;
         toucans ++;
         System.out.println(toucans);
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
        int squirrels = 4;
        int nuts = 2;
        int moreSquirrelsThanNuts = squirrels - nuts;
        System.out.println(moreSquirrelsThanNuts);
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int mrsHiltMoney = quarter + dime + (nickel * 2);
        System.out.println(mrsHiltMoney + " " +"cents");
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
        int brierMuffins = 18;
        int macAdamsMuffins = 20; 
        int flanneryMuffins = 17;
        int totalMuffinsGrade1 = brierMuffins + macAdamsMuffins + flanneryMuffins;
        System.out.println(totalMuffinsGrade1);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int yoyoCostInCents = 24;
        int whistleCostInCents = 14;
        int hiltMoneySpent = yoyoCostInCents + whistleCostInCents; 
        System.out.println(hiltMoneySpent + " " + "cents");
        
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
         int largeMallows = 8;
         int miniMallows = 10;
         int totalMallows = largeMallows + miniMallows;
         System.out.println(totalMallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int totalSnowHiltHouse = 29;
        int totalSnowBrecknockElem = 17;
        System.out.println(totalSnowHiltHouse - totalSnowBrecknockElem);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int hiltMoneyInDollars = 10;
        int costOfTruckInDollars = 3;
        int costOfPencilCaseInDollars = 2;
        int remainingHiltMoneyInDollars = hiltMoneyInDollars - costOfTruckInDollars - costOfPencilCaseInDollars;
        System.out.println("$" + remainingHiltMoneyInDollars);
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int joshtotalMarbles = 16;
        joshtotalMarbles = joshtotalMarbles - 7;
        System.out.println(joshtotalMarbles);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int currentSeashellCollection = 19;
        int seashellCollectionGoal = 25;
        int remainingSeashellsNeeded = seashellCollectionGoal - currentSeashellCollection;
        System.out.println(remainingSeashellsNeeded);
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
          int totalBalloons = 17;
          int redBallons = 8;
          int greenBalloons = totalBalloons - redBallons;
          System.out.println(greenBalloons);
        
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksOnShelf = 38; 
        booksOnShelf = 38 + 10;
        System.out.println(booksOnShelf);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int legsOfOneBee = 6;
        int totalNumberOfBees = 8;
        int totalNumberOfBeeLegs = legsOfOneBee * totalNumberOfBees;
        System.out.println(totalNumberOfBeeLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
       
        int costOfIceCreamConeInCents = 99;
        System.out.println(costOfIceCreamConeInCents * 2);
       
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int totalRocksNeededForBoarder = 125; 
        int currentRockCount = 64;
        int rocksStillNeeded = totalRocksNeededForBoarder - currentRockCount;
        System.out.println(rocksStillNeeded);
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int hiltMarbleCount = 38;
         hiltMarbleCount = hiltMarbleCount - 15;
         System.out.println(hiltMarbleCount);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int totalMilesToConcert = 78;
        int totalMilesDriven = 32;
        int milesNeededToDrive = totalMilesToConcert - totalMilesDriven;
        System.out.println(milesNeededToDrive);
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int minutesShovelingSnowMorning = 90;
        int minutesShovelingSnowAfternoon = 45;
        int totalShovelingTime = minutesShovelingSnowMorning + minutesShovelingSnowAfternoon;
        System.out.println(totalShovelingTime + " " + "minutes shoveling.");
        		
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        double costOfOneHotDogInCents = .50;
        int totalHotDogsPurchased = 6; 
        int totalCostOfHotDogs = (int)(costOfOneHotDogInCents * totalHotDogsPurchased) * 100; 
        totalCostOfHotDogs = totalCostOfHotDogs/100;
        System.out.println("$" + totalCostOfHotDogs);
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int hiltMoneyInCents = 50;
        int pencilCostInCents = 7; 
        int pencilsYouCanBuy = hiltMoneyInCents / pencilCostInCents; 
        System.out.println(pencilsYouCanBuy);
     
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalButterflies = 33; 
        int redButterflies = 20; 
        int orangeButterflies = totalButterflies - redButterflies; 
        System.out.println(orangeButterflies);
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        int moneyGiven = 100;
        int costOfGoods = 54;
        int changeBack =(moneyGiven - costOfGoods);
        System.out.println(changeBack + " cents");
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int treesInBackyard = 13; 
        treesInBackyard = treesInBackyard + 12; 
        System.out.println(treesInBackyard);
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int hoursInDay = 24; 
        int daysUntilVisit = 2; 
        int hoursUntilVisit = hoursInDay * daysUntilVisit;
        System.out.println(hoursUntilVisit);
       
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int numberOfCousins = 4; 
        int piecesGumPerPerson = 5; 
        int totalGumNeeded = numberOfCousins * piecesGumPerPerson;
        System.out.println(totalGumNeeded);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        int danMoneyInDollars = 3; 
        int costOfPurchaseInDollars = 1;
        danMoneyInDollars = danMoneyInDollars - costOfPurchaseInDollars;
        System.out.println(danMoneyInDollars);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */ 
        int boatsInLake = 5; 
        int peopleInBoat = 3;
        int totalPeopleInBoats = boatsInLake * peopleInBoat;
        System.out.println(totalPeopleInBoats);
        
 
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
          int legoTotal = 380; 
          legoTotal = legoTotal - 57; 
          System.out.println(legoTotal);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int muffinsBaked = 35;
        int muffinsNeeded = 83; 
        int muffinsToBake = muffinsNeeded - muffinsBaked;
        System.out.println(muffinsToBake);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int crayonsWillyTotal = 1400; 
        int crayonsLucyTotal = 290; 
        System.out.println(crayonsWillyTotal-crayonsLucyTotal);
        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickerPerPage = 10; 
        int totalPagesInStickerBook = 22;
        int totalStickers = stickerPerPage * totalPagesInStickerBook; 
        System.out.println(totalStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int totalCupcakes = 96; 
        int cupcakesPerPerson = totalCupcakes/8; 
        System.out.println(cupcakesPerPerson);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int totalCookies = 47; 
        int totalCookiesInJars = 6;
        int leftOverCookies = totalCookies % totalCookiesInJars; 
        System.out.println(leftOverCookies);
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int totalCroissants = 59; 
        int totalNeighbors = 8;
        int leftOverCroissants = totalCroissants % totalNeighbors; 
        System.out.println(leftOverCroissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
            int totalCookiesToBake = 276; 
            int cookiesPerTray = 12; 
            int traysNeeded = totalCookiesToBake / cookiesPerTray;
            System.out.println(traysNeeded);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int totalPretzels = 480; 
        int servingSize = 12; 
        int totalServingsOfPretzels = totalPretzels / servingSize; 
        System.out.println(totalServingsOfPretzels);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
           int cupcakesBaked = 53; 
           cupcakesBaked = cupcakesBaked - 2;
           int boxesOf3Cupcakes = cupcakesBaked / 3; 
           System.out.println(boxesOf3Cupcakes);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
           int totalCarrotSticks = 74; 
           int totalPeople = 12;
           int leftOverCarrotSticks = totalCarrotSticks % totalPeople; 
           System.out.println(leftOverCarrotSticks);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int totalTeddyBears = 98;
        int bearsPerShelf = 7; 
        int shelvesNeededFoBears = totalTeddyBears / bearsPerShelf;
        System.out.println(shelvesNeededFoBears);
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int totalFamilyPictures = 480;
        int picturesInAlbum = 20; 
        int albumsNeeded = totalFamilyPictures / picturesInAlbum;
        System.out.println(albumsNeeded);
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int cardCollectionTotal = 94; 
        int cardsPerBox = 8; 
        int boxesNeeded = cardCollectionTotal / cardsPerBox; 
        int cardsInPartiallyFilledBox = cardCollectionTotal % cardsPerBox;
        System.out.println(boxesNeeded + " full boxes of cards and " + cardsInPartiallyFilledBox + " remaning in an unfilled box");
      
            
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int totalBooks = 210;
        int booksPerShelf = 10; 
        int shelvesNeededForBooks = totalBooks / booksPerShelf;
        System.out.println(shelvesNeededForBooks);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int totalCroissantsBaked = 17;
        int totalGuestsAtparty = 7; 
        int croissantsPerGuest = totalCroissantsBaked / totalGuestsAtparty ;
        System.out.println(croissantsPerGuest);
        
	}

}
