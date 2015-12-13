import java.awt.event.KeyEvent;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UIMTest {
    UIM uim;
    TCPCM tcpcm;
    DOM dom;

    @org.junit.Before
    public void UIM() throws Exception {
        tcpcm = mock(TCPCM.class);
        dom = mock(DOM.class);
        uim = new UIM(tcpcm, dom);
    }

    @org.junit.Test
    public void testKeyTyped() throws Exception {

    }

    @org.junit.Test
    public void testKeyPressed() throws Exception {
        KeyEvent mockedKeyPressedEvent = new KeyEvent(uim, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),
                0, KeyEvent.VK_KP_UP, KeyEvent.CHAR_UNDEFINED);
        uim.keyPressed(mockedKeyPressedEvent);
        verify(tcpcm).inputMoves(0);

        mockedKeyPressedEvent = new KeyEvent(uim, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),
                0, KeyEvent.VK_UP, KeyEvent.CHAR_UNDEFINED);
        uim.keyPressed(mockedKeyPressedEvent);
        verify(tcpcm).inputMoves(0);

        mockedKeyPressedEvent = new KeyEvent(uim, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),
                0, KeyEvent.VK_KP_RIGHT, KeyEvent.CHAR_UNDEFINED);
        uim.keyPressed(mockedKeyPressedEvent);
        verify(tcpcm).inputMoves(1);

        mockedKeyPressedEvent = new KeyEvent(uim, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),
                0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        uim.keyPressed(mockedKeyPressedEvent);
        verify(tcpcm).inputMoves(1);

        mockedKeyPressedEvent = new KeyEvent(uim, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),
                0, KeyEvent.VK_KP_DOWN, KeyEvent.CHAR_UNDEFINED);
        uim.keyPressed(mockedKeyPressedEvent);
        verify(tcpcm).inputMoves(2);

        mockedKeyPressedEvent = new KeyEvent(uim, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),
                0, KeyEvent.VK_DOWN, KeyEvent.CHAR_UNDEFINED);
        uim.keyPressed(mockedKeyPressedEvent);
        verify(tcpcm).inputMoves(2);

        mockedKeyPressedEvent = new KeyEvent(uim, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),
                0, KeyEvent.VK_KP_LEFT, KeyEvent.CHAR_UNDEFINED);
        uim.keyPressed(mockedKeyPressedEvent);
        verify(tcpcm).inputMoves(3);

        mockedKeyPressedEvent = new KeyEvent(uim, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),
                0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        uim.keyPressed(mockedKeyPressedEvent);
        verify(tcpcm).inputMoves(3);
    }

    @org.junit.Test
    public void testKeyReleased() throws Exception {

    }
}