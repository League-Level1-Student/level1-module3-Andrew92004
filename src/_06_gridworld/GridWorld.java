package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String [] args) {
World world = new World();
Location loc = new Location(3,2);
Location loc2 = new Location(5,3);
Bug bee = new Bug();
Flower rose = new Flower(Color.red);
world.show();
bee.setColor(Color.yellow);
world.add(loc, bee);
world.add(loc2, rose);
}
}