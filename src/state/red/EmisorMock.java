package state.red;

public final class EmisorMock implements Emisor {
    private int ref = 0;

    @Override
    public void enviar(String msg) {
        ref++;
    }

    public int getRef() {
        return ref;
    }

}
