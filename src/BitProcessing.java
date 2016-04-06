
public class BitProcessing {
    public boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    public int setBit(int num, int i) {
        return num | (1 << i);
    }

    public int clearBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    public int clearBitsUntilI(int num, int i) {
        int mask = (1 << (i + 1)) - 1;
        return num & mask;
    }

    public int clearBitsFromITo0(int num, int i) {
        int mask = ~((1 << (i + 1)) - 1);
        return num & mask;
    }

    public int updateBit(int num, int i, int v) {
        int mask = ~(1 << i);
        return (num & mask) | (v << i);
    }
}
