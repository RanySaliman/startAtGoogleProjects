package Day4.Exc2;

public enum BIRD_NAME {
    BarnOwl("Tyto alba"){
        public void sing(){
            System.out.println("screeeeee");
        }
    },
    BlueJay("Cyanocitta cristata"){
        public void sing(){
            System.out.println("fee-der-de-lurp-jay-jay-jay-queedle-queedle-queedle");
        }
    },
    Cuckoo("Cuculus canorus"){
        public void sing(){
            System.out.println("ku-ku");
        }
    },
    Flamingo("Phoenicopterus ruber"){
        public void sing(){
            System.out.println("The flamingo produces a goose-like honk");
        }
    };

    BIRD_NAME(String s) {
        this.scientificName = s;
    }
    public final String scientificName;
    public abstract void sing();
}
