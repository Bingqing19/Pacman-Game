package basecode;

import java.awt.Image;

/**
 * This interface should be implemented by characters in the game such as the
 * pacman and the ghost.
 *
 */
public interface Character {

    /**
     * This method moves the character to the left with fixed velocity. It will
     * bypass the obstacles and only move in a specified area of the board.
     */
    public void moveLeft();

    /**
     * This method moves the character to the right with fixed velocity. It will
     * bypass the obstacles and only move in a specified area of the board.
     */
    public void moveRight();

    /**
     * This method moves the character up with fixed velocity. It will bypass
     * the obstacles and only move in a specified area of the board.
     */
    public void moveUp();

    /**
     * This method moves the character down with fixed velocity. It will bypass
     * the obstacles and only move in a specified area of the board.
     */
    public void moveDown();

    /**
     * @return the Image instance variable of the character.
     */
    public Image getImage();

    /**
     * @return the number representing the position of the character on x-axis.
     */
    public int getPosX();

    /**
     * @return the number representing the position of the character on y-axis.
     */
    public int getPosY();
    
    /**
     * @return the number representing the direction of the pacman is moving.
     */
    public int getDirection();

    /**
     * @param x x-axis position of the character
     * @param y y-axis position of the character
     * @return true if the there is a collide between the character and other
     *         character, otherwise it returns false.
     */
    public boolean checkCollide(int x, int y);

}
