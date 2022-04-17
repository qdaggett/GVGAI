package ontology.sprites;

import java.awt.Dimension;
import core.vgdl.VGDLSprite;
import core.content.SpriteContent;
import ontology.Types;
import tools.Vector2d;

public class ActionMarker extends VGDLSprite
{
	public ActionMarker() {}
	
	public ActionMarker(Vector2d pos, Dimension size, SpriteContent cont)
	{
		this.init(pos, size);
		
		loadDefaults();
		
		this.parseParameters(cont);
		
		postProcess();
	}
	
	public void postProcess()
	{
		super.postProcess();
	}
	
	protected void loadDefaults()
	{
		super.loadDefaults();
		super.img = "oryx/bat1";
		super.orientedImg = null;
		is_static = true;
		hidden = "true";
		
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