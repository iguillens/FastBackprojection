package shader;

import ivengine.shaders.SimpleShaderProgram;
import org.lwjgl.opengl.GL11;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glGetAttribLocation;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;

public class VoxelizationShader extends SimpleShaderProgram
{
	public VoxelizationShader()
	{
		super("/shaders/pn.vsh","/shaders/pn.fsh","/shaders/pn.gsh",true);
	}

	@Override
	public void setupAttributes() 
	{
		int locAttrib=glGetAttribLocation(this.getID(),"location");
		glVertexAttribPointer(locAttrib,3,GL11.GL_FLOAT,false,4*this.getSize(),0);
		glEnableVertexAttribArray(locAttrib);
		/*int normAttrib=glGetAttribLocation(this.getID(),"normal");
		glVertexAttribPointer(normAttrib,3,GL11.GL_FLOAT,false,4*this.getSize(),3*4);
		glEnableVertexAttribArray(normAttrib);*/
	}

	@Override
	public int getSize() 
	{
		return 3;
	}

	@Override
	protected void dispose() 
	{

	}
}
