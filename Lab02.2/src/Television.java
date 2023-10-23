import java.util.Arrays;

/*
 * Business class to model the workings of a television, no main() method here.
 */
class Television {
    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "Sony", "LG", "Toshiba" }; //in whiteboard model, use enum
    private static int instanceCount = 0;
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Attributes or properties - aka "fields" or "instance variables" - Java
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;

    private boolean isMuted;    //provide getter, only
    private int oldVolume;      //completely hidden, no get/set methods

    public Television(){
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);        //for "this" to work, an originating ctor must be made above
        setVolume(volume);  //this is the originating ctor for volume, subsequent calls will be referred here
                            //any additional, future ctors made below for further overloading will route through here
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    //business "action" methods
    public void mute() {
        if (!isMuted()) {   // not currently muted, emitted sound (32)
            oldVolume = getVolume();
            setVolume(0);   // of use MIN_VOLUME
            isMuted = true;
        }
        else {              // otherwise, we are currently muted, so restore volume from oldVolume
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    // functions or operations - aka "methods" in Java - what do Television objects do?
    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();
        //System.out.println(verifyInternetConnection());
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye.");
        System.out.println();
    }

    // accessor methods - provide "controlled access" to the object's fields
    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    // VALID_BRANDS looks like this ["Samsung", "Sony", "LG", "Toshiba"]
    public void setBrand(String brand) {
        boolean valid = false;

        if (isValidBrand(brand)) {      //delegate to private method
            this.brand =brand;
        }
        else {
            System.out.printf("Invalid brand: %s. Must be one of %s.\n", brand, Arrays.toString(VALID_BRANDS));
        }
    }

    // VALID_BRANDS looks like this ["Samsung", "Sony", "LG", "Toshiba"]
    private static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
       if (volume >= MIN_VOLUME && volume <= MAX_VOLUME){ // or (MIN_VOLUME <= volume && volume && <= MAX_VOLUME)
           this.volume = volume;
           isMuted = false;     //automatically unmuted
       }
       else {
           System.out.printf("Invalid volume: %s. Must be between %s and %s.\n", volume, MIN_VOLUME, MAX_VOLUME);

           //System.out.println("Invalid volume input: " + volume + "." +
           //       " Must be between " + MIN_VOLUME + " and " + MAX_VOLUME + ".");
       }
    }

    private boolean verifyInternetConnection() {
        return true; //fake implementation (obviously)
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s",
                getBrand(), volumeString, getDisplay());

//        return "Television: brand=" + getBrand() + ", volume=" + volumeString + ", display=" + display;
    }

}