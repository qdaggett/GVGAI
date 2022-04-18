package ontology.sprites;

import java.awt.Dimension;

import core.vgdl.VGDLRegistry;
import core.vgdl.VGDLSprite;
import core.content.SpriteContent;
import core.game.Game;
import ontology.Types;
import tools.Direction;
import tools.Vector2d;

public class ActionMarker extends VGDLSprite
{
	
	public String test = "ActionMarker img=oryx/bullet1 hidden=true color=ORANGE";
	
	boolean hasDir = false;
	
	public ActionMarker() {}
	
	public ActionMarker(Vector2d pos, Dimension size, SpriteContent cont)
	{
		this.init(pos, size);
		
		loadDefaults();
		
		SpriteContent content = new SpriteContent(test);
		
		this.parseParameters(content);
		
		postProcess();
	}
	
	public void postProcess()
	{
		super.postProcess();
	}
	
	protected void loadDefaults()
	{
		super.loadDefaults();
		orientation = Types.DRIGHT.copy();
		is_oriented = true;
		draw_arrow = true;
		is_static = true;
		rotateInPlace = true;
		
	}
	
	public VGDLSprite copy()
	{
		ActionMarker newSprite = new ActionMarker();
		this.copyTo(newSprite);
		return newSprite;
	}
	
	public void copyTo(VGDLSprite target)
	{
		ActionMarker targetSprite = (ActionMarker) target;
		super.copyTo(targetSprite);
	}
	
	
	
}