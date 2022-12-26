package Steps;

public class constants {
    public String title;
    public String price;
    public String description;
    public constants(String title, String price, String description){
        this.title = title;
        this.price = price;
        this.description = description;
    }

    constants[] productos = new constants[9];

    final public static String s6Title = "Samsung galaxy s6";
    final public static String s6Price = "$360 *includes tax";
    final public static String s6Description = "Product description\nThe Samsung Galaxy S6 is powered by 1.5GHz " +
            "octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal" +
            " storage cannot be expanded.";
    final public static String lumiaTitle = "Nokia lumia 1520";
    final public static String lumiaPrice = "$820 *includes tax";
    final public static String lumiaDescription = "Product description\n" +
            "The Nokia Lumia 1520 is powered by 2.2GHz quad-core Qualcomm Snapdragon 800 processor" +
            " and it comes with 2GB of RAM.";
    final public static String nexus6Title = "Nexus 6";
    final public static String nexus6Price = "$650 *includes tax";
    final public static String nexus6Description = "Product description\n" +
            "The Motorola Google Nexus 6 is powered by 2.7GHz quad-core Qualcomm Snapdragon 805 processor and it" +
            " comes with 3GB of RAM.";
    final public static String s7Title = "Samsung galaxy s7";
    final public static String s7Price = "$800 *includes tax";
    final public static String s7Description = "Product description\n" +
            "The Samsung Galaxy S7 is powered by 1.6GHz octa-core it comes with 4GB of RAM. The phone packs 32GB" +
            " of internal storage that can be expanded up to 200GB via a microSD card.";
    final public static String iphone6Title = "Iphone 6 32gb";
    final public static String iphone6Price = "$790 *includes tax";
    final public static String iphone6Description= "Product description\n" +
            "It comes with 1GB of RAM. The phone packs 16GB of internal storage cannot be expanded. As far as the" +
            " cameras are concerned, the Apple iPhone 6 packs a 8-megapixel primary camera on the rear and" +
            " a 1.2-megapixel front shooter for selfies.";
    final public static String xperiaTitle = "Sony xperia z5";
    final public static String xperiaPrice = "$320 *includes tax";
    final public static String xperiaDescription = "Product description\n" +
            "Sony Xperia Z5 Dual smartphone was launched in September 2015. The phone comes with a 5.20-inch" +
            " touchscreen display with a resolution of 1080 pixels by 1920 pixels at a PPI of 424 pixels per inch.";
    final public static String htcTitle = "HTC One M9";
    final public static String htcPrice = "$700 *includes tax";
    final public static String htcDescription = "Product description\n" +
            "The HTC One M9 is powered by 1.5GHz octa-core Qualcomm Snapdragon 810 processor and it comes with 3GB" +
            " of RAM. The phone packs 32GB of internal storage that can be expanded up to 128GB via a microSD card.";
    final public static String vaioi5Title = "Sony vaio i5";
    final public static String vaioi5Price = "$790 *includes tax";
    final public static String vaioi5Description = "Product description\n" +
            "Sony is so confident that the VAIO S is a superior ultraportable laptop that the company proudly" +
            " compares the notebook to Apple's 13-inch MacBook Pro. And in a lot of ways this notebook is better," +
            " thanks to a lighter weight.";
    final public static String vaioi7Title = "Sony vaio i7";
    final public static String vaioi7Price = "$790 *includes tax";
    final public static String vaioi7Description = "Product description\n" +
            "REVIEW Sony is so confident that the VAIO S is a superior ultraportable laptop that the company proudly" +
            " compares the notebook to Apple's 13-inch MacBook Pro. And in a lot of ways this notebook is better," +
            " thanks to a lighter weight, higher-resolution display, more storage space, and a Blu-ray drive.";


    final public static String alertText = "Product added";
    public constants productsConstants(int number){

        productos[0] = new constants(s6Title,s6Price,s6Description);
        productos[1] = new constants(lumiaTitle,lumiaPrice,lumiaDescription);
        productos[2] = new constants(nexus6Title,nexus6Price,nexus6Description);
        productos[3] = new constants(s7Title,s7Price,s7Description);
        productos[4] = new constants(iphone6Title,iphone6Price,iphone6Description);
        productos[5] = new constants(xperiaTitle,xperiaPrice,xperiaDescription);
        productos[6] = new constants(htcTitle, htcPrice, htcDescription);
        productos[7] = new constants(vaioi5Title, vaioi5Price, vaioi5Description);
        productos[8] = new constants(vaioi7Title, vaioi7Price, vaioi7Description);

        return productos[number];
    }


}
