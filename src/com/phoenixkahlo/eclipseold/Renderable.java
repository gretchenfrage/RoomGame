package com.phoenixkahlo.eclipseold;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * Indicates a body that will be rendered upon the call to the EclipseWorld's render method.
 */
public interface Renderable {

	void render(GameContainer container, Graphics g) throws SlickException;
	
	void init() throws SlickException;
	
}
