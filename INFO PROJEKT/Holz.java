import greenfoot.*;

/**
 * Write a description of class Holz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Holz extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("titel.mp3");
    
    
    /**
     * Constructor for objects of class Holz.
     * 
     */
    public Holz()
    {    
        //Weltgröße 
        super(1000, 1000, 1);
        //Die Hintergrund Musik welche in wunderschönen Loop gespielt wird
        backgroundMusic.playLoop();
    
        prepare();
    }
  
    
    /**
     * Bereite die Welt für den Programmstart vor. Das heißt: Erzeuge die Anfangs-
     * Objekte und füge sie der Welt hinzu.
     */
    private void prepare()
    {
        //Die Objekte welche gespawnt werden
        wand wand = new wand();
        addObject(wand, 18, 40);
        wand.setLocation(10, 47);
        wand wand2 = new wand();
        addObject(wand2, 23, 47);
        wand2.setLocation(22, 47);
        wand wand3 = new wand();
        addObject(wand3, 7, 39);
        wand3.setRotation(90);
        wand3.setLocation(6, 43);
        wand wand4 = new wand();
        addObject(wand4, 20, 42);
        wand4.setRotation(90);
        wand4.setLocation(26, 43);
        wand wand5 = new wand();
        addObject(wand5, 10, 39);
        wand wand6 = new wand();
        addObject(wand6, 22, 39);
        wand5.setLocation(10, 39);
        wand6.setLocation(23, 39);
        wand5.setLocation(11, 39);
        wand5.setLocation(10, 39);
        wand6.setLocation(22, 39);
        wand6.setLocation(23, 39);
        wand6.setRotation(90);
        wand6.setLocation(26, 39);
        wand5.setLocation(11, 35);
        wand wand7 = new wand();
        addObject(wand7, 9, 37);
        wand7.setRotation(90);
        wand7.setLocation(6, 39);
        wand5.setLocation(10, 35);
        wand wand8 = new wand();
        addObject(wand8, 23, 35);
        wand8.setLocation(22, 35);
        wand wand9 = new wand();
        addObject(wand9, 10, 17);
        wand wand10 = new wand();
        addObject(wand10, 18, 17);
        wand wand11 = new wand();
        addObject(wand11, 25, 17);
        wand wand12 = new wand();
        addObject(wand12, 29, 17);
        wand12.setLocation(33, 17);
        wand wand13 = new wand();
        addObject(wand13, 37, 24);
        wand13.setRotation(90);
        wand13.setLocation(37, 21);
        wand wand14 = new wand();
        addObject(wand14, 38, 25);
        wand14.setRotation(90);
        wand14.setLocation(37, 28);
        wand wand15 = new wand();
        addObject(wand15, 32, 33);
        wand15.setRotation(90);
        wand15.setLocation(37, 31);
        wand wand16 = new wand();
        addObject(wand16, 29, 35);
        wand wand17 = new wand();
        addObject(wand17, 33, 35);
        wand wand18 = new wand();
        addObject(wand18, 8, 20);
        wand18.setRotation(90);
        wand18.setLocation(6, 21);
        wand wand19 = new wand();
        addObject(wand19, 8, 28);
        wand19.setRotation(90);
        wand19.setLocation(6, 31);
        wand wand20 = new wand();
        addObject(wand20, 15, 29);
        wand20.setRotation(90);
        wand20.setLocation(6, 28);
        wand20.setLocation(108, 437);
        wand19.setLocation(108, 583);
        wand17.setLocation(194, 666);
        wand16.setLocation(195, 351);
        wand16.setLocation(192, 352);
        wand18.setLocation(320, 615);
        wand18.setLocation(538, 559);
        wand15.setLocation(326, 304);
        wand14.setLocation(374, 360);
        wand13.setLocation(244, 565);
        wand15.setLocation(404, 574);
        wand17.setLocation(194, 666);
        wand17.setLocation(194, 666);
        wand13.setLocation(497, 632);
        wand15.setLocation(450, 586);
        wand12.setLocation(613, 423);
        wand14.setLocation(452, 443);
        wand12.setLocation(346, 352);
        wand14.setLocation(429, 436);
        wand19.setLocation(108, 785);
        wand17.setLocation(192, 868);
        wand20.setLocation(109, 617);
        wand20.setLocation(108, 617);
        wand16.setLocation(193, 533);
        wand12.setLocation(350, 353);
        wand12.setLocation(347, 534);
        wand14.setLocation(428, 618);
        wand14.setLocation(429, 612);
        wand14.setLocation(453, 641);
        wand12.setLocation(339, 533);
        wand14.setLocation(423, 788);
        wand11.setLocation(25, 17);
        wand11.setLocation(25, 17);
        wand11.setLocation(25, 17);
        wand11.setLocation(25, 17);
        wand11.setLocation(25, 17);
        wand11.setLocation(25, 17);
        wand11.setLocation(25, 17);
        wand11.setLocation(420, 867);
        wand14.setLocation(512, 782);
        wand14.setLocation(502, 784);
        wand15.setLocation(410, 649);
        wand18.setLocation(303, 290);
        wand10.setLocation(406, 531);
        wand13.setLocation(490, 626);
        wand13.setLocation(575, 675);
        wand15.setLocation(502, 631);
        wand10.setLocation(419, 533);
        wand13.setLocation(502, 615);
        wand18.setLocation(502, 452);
        wand16.setLocation(202, 367);
        wand12.setLocation(371, 367);
        wand10.setLocation(408, 503);
        wand16.setLocation(192, 534);
        wand18.setLocation(500, 550);
        wand10.setLocation(362, 536);
        wand10.setLocation(360, 534);
        wand12.setLocation(358, 535);
        wand18.setLocation(502, 546);
        wand12.setLocation(367, 619);
        wand18.setLocation(517, 545);
        wand18.setLocation(548, 547);
        wand13.setLocation(497, 630);
        wand15.setLocation(518, 650);
        wand10.setLocation(363, 534);
        wand18.setLocation(572, 552);
        wand18.setLocation(599, 557);
        wand12.setLocation(341, 616);
        wand10.setLocation(288, 533);
        wand12.setLocation(391, 533);
        wand12.setLocation(478, 568);
        wand10.setLocation(364, 534);
        wand13.setLocation(532, 696);
        wand15.setLocation(578, 682);
        wand12.setLocation(711, 570);
        wand15.setLocation(577, 653);
        wand10.setLocation(363, 534);
        wand18.setLocation(597, 540);
        wand18.setLocation(322, 722);
        wand10.setLocation(396, 535);
        wand16.setLocation(193, 533);
        wand10.setLocation(364, 533);
        wand15.setLocation(311, 657);
        wand12.setLocation(420, 533);
        wand13.setLocation(502, 695);
        wand13.setLocation(502, 714);
        wand18.setLocation(680, 628);
        wand9.setLocation(589, 533);
        wand18.setLocation(672, 617);
        wand15.setLocation(672, 771);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(22, 35);
        wand8.setLocation(633, 919);
        wand15.setLocation(758, 653);
        wand8.setLocation(586, 867);
        wand15.setLocation(778, 618);
        wand6.setLocation(579, 446);
        wand4.setLocation(798, 334);
        wand2.setLocation(663, 363);
        wand4.setLocation(872, 448);
        wand7.setLocation(364, 347);
        wand5.setLocation(790, 363);
        wand7.setLocation(900, 574);
        wand3.setLocation(888, 689);
        wand7.setLocation(883, 750);
        wand.setLocation(863, 535);
        wand4.setLocation(942, 451);
        wand4.setLocation(944, 452);
        wand4.setLocation(944, 451);
        wand3.setLocation(857, 680);
        wand15.setRotation(90);
        wand15.setLocation(779, 618);
        wand15.setRotation(180);
        wand15.setLocation(861, 362);
        wand3.setLocation(778, 620);
        wand7.setLocation(876, 788);
        wand wand21 = new wand();
        addObject(wand21, 757, 873);
        wand21.setLocation(753, 867);
        wand wand22 = new wand();
        addObject(wand22, 871, 709);
        wand22.setLocation(862, 704);
        wand22.setLocation(861, 703);
        wand22.setLocation(862, 704);
        wand22.setLocation(863, 701);
        wand7.setLocation(943, 783);
        wand wand23 = new wand();
        addObject(wand23, 858, 869);
        wand23.setLocation(863, 867);
        wand23.setLocation(861, 867);
        wand4.setLocation(947, 451);
        wand15.setLocation(864, 361);
        wand15.setLocation(862, 362);
        wand12.setLocation(363, 533);
        wand wand24 = new wand();
        addObject(wand24, 501, 368);
        wand24.setLocation(498, 363);
        wand wand25 = new wand();
        addObject(wand25, 350, 370);
        wand wand26 = new wand();
        addObject(wand26, 232, 436);
        wand26.setRotation(180);
        wand26.setRotation(180);
        wand26.setRotation(90);
        wand26.setLocation(264, 452);
        wand26.setLocation(261, 448);
        wand26.setLocation(259, 446);
        wand26.setLocation(262, 450);
        wand26.setLocation(249, 450);
        wand25.setLocation(334, 363);
        wand26.setLocation(250, 450);

        Zielfeld zielfeld = new Zielfeld();
        addObject(zielfeld,807,441);
        zielfeld.setLocation(917,772);
        zielfeld.setLocation(909,811);
        zielfeld.setLocation(922,850);
        zielfeld.setLocation(914,836);

        Detektiv detektiv = new Detektiv();
        addObject(detektiv,299,904);
        Innocent innocent = new Innocent();
        addObject(innocent,306,420);
        Innocent innocent2 = new Innocent();
        addObject(innocent2,897,499);
        Innocent innocent3 = new Innocent();
        addObject(innocent3,554,824);
        Innocent innocent4 = new Innocent();
        addObject(innocent4,160,638);
        innocent4.setLocation(153,719);
        detektiv.setLocation(284,886);
       
    }
}
