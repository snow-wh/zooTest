package sizeEnum;

public enum CageSize {

    OVER_BIG_ANIMAL (100),
     BIG_ANIMAL (50),
     MID_ANIMAL (10),
     SMALL_ANIMAL (3);

    private int size;

    CageSize(int size) {
        this.size = size;
    }

    public int getSize(){
        return size;
    }

}
