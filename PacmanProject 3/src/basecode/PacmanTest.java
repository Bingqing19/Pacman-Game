package basecode;


import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class PacmanTest {
	private Pacman pacman = new Pacman(10, 10);;
	List<Ghost> ghosts = new ArrayList<>();
	private Maze maze = new Maze();
	
	/**
	 * test: checkCollide method in the Pacman class
	 * check: when collide occurs, the pacman and the ghost are on the same location
	 */
	@Test
	void testCheckCollide() {
        for (Ghost ghost : ghosts) {
		    if(pacman.checkCollide(ghost.getPosX(), ghost.getPosY())) {
	            assertEquals(pacman.getPosX(),ghost.getPosX());
	            assertEquals(pacman.getPosY(),ghost.getPosY());
		    }
        }
	}
	
	/**
	 * test: updateFood method in the Maze class
	 * check: after updating the food, the number of food is he maximum
	 */
	@Test
	void testUpdateFood() {
		
	     maze.updateFood(pacman.getPosX(), pacman.getPosY());
		 assertEquals(188,maze.getNumOfFood());
	     
    }
	
	/**
	 * test:checkWalls method in the Maze class
	 * check: after hitting the wall in a certain location, the pacman turns left
	 */
	@Test
	void testCheckWalls() {
		
		 maze.checkWalls(pacman.getPosX(), pacman.getPosY());
		 assertEquals(0,pacman.getDirection());
	     
    }
	
	

}
