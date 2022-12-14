package j.game.Controller;

import j.game.Model.Ghost;


/**
 * interface for classes interested in Ghost movements
 */
public interface GhostMovedListener {

    void ghostMoved(int prevX, int prevY, Ghost ghost);
    void collisionDetected();
}