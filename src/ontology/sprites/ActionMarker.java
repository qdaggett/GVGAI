package ontology.sprites;

import java.awt.Dimension;
import core.vgdl.VGDLSprite;
import core.content.SpriteContent;
import ontology.Types;
import tools.Vector2d;

public class ActionMarker extends VGDLSprite
{
	
	public String test = "ActionMarker img=oryx/bat1 hidden=true";
	
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
		is_oriented = true;
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