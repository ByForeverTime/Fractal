package com.redknot.g;

import java.util.Random;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;

public class Fractint {
	public void fractint(SurfaceHolder holder, Paint p) {
		int i, k, x1, y1, j;
		float tempx, x, y;
		
		float[][] d = new float[23][7];
		
		d[1][1]=0;d[1][2]=-0.11f;d[1][3]=0.22f;d[1][4]=0;d[1][5]=-62.5f*2;d[1][6]=48.4f*2;
		d[2][1]=0.11f;d[2][2]=0.02f;d[2][3]=0;d[2][4]=0.11f;d[2][5]=-63*2;d[2][6]=59.9f*2;
		d[3][1]=0.06f;d[3][2]=0.02f;d[3][3]=0;d[3][4]=0.1f; d[3][5]=-62.5f*2;d[3][6]=45.1f*2;
		d[4][1]=0;d[4][2]= -0.11f;d[4][3]=0.22f;d[4][4]=0; d[4][5]=-43.4f*2;d[4][6]=48.4f*2;
		d[5][1]=0.08f;d[5][2]=0;d[5][3]=0;d[5][4]=0.11f;d[5][5]=-45*2;d[5][6]=59.9f*2;
		d[6][1]=0;d[6][2]=0.11f;d[6][3]=-0.08f;d[6][4]=0;d[6][5]=-43*2;d[6][6]=61.5f*2;
		   d[7][1]=-0.09f;d[7][2]=0;d[7][3]=-0.01f;d[7][4]=-0.13f;d[7][5]=-41.5f*2;d[7][6]=59.4f*2;
		   d[8][1]=0.06f; d[8][2]=0.11f;d[8][3]=-0.13f;d[8][4]=0;d[8][5]=-46.9f*2;d[8][6]=41.5f*2;
		   d[9][1]=0.03f;d[9][2]=-0.11f;d[9][3]=0.23f;d[9][4]=0.11f;d[9][5]=-22.6f*2;d[9][6]=44.3f*2;
		   d[10][1]=0.03f;d[10][2]=0.11f;d[10][3]=-0.25f;d[10][4]=0;d[10][5]=-25.7f*2;d[10][6]=49.1f*2;
		   d[11][1]=0.06f;d[11][2]=0;d[11][3]=0;d[11][4]=0.11f; d[11][5]=-24*2;d[11][6]=44.6f*2;
		   d[12][1]=0;d[12][2]=0.11f;d[12][3]=-0.19f;d[12][4]=0;d[12][5]=-16.2f*2;d[12][6]=49.9f*2;
		   d[13][1]=0.09f;d[13][2]=-0.01f;d[13][3]=0;d[13][4]=0.1f;d[13][5]=-5.8f*2;d[13][6]=29.6f*2;
		   d[14][1]=-0.09f;d[14][2]=0;d[14][3]=0;d[14][4]=-0.11f;d[14][5]=-6.5f*2;d[14][6]=71*2;
		   d[15][1]=0.12f;d[15][2]=0;d[15][3]=0;d[15][4]=0.11f;d[15][5]=12.4f*2;d[15][6]=60*2;
		   d[16][1]=0;d[16][2]=0.11f;d[16][3]=-0.22f;d[16][4]=0;d[16][5]=6.8f*2;d[16][6]=48*2;
		   d[17][1]=-0.12f;d[17][2]=0;d[17][3]=0;d[17][4]=-0.13f; d[17][5]=61.7f*2;d[17][6]=71.8f*2;
		   d[18][1]=0;d[18][2]=-0.11f;d[18][3]=0.22f;d[18][4]=0; d[18][5]=67.8f*2;d[18][6]=48.4f*2;
	   d[19][1]=0;d[19][2]=0.08f;d[19][3]=-0.25f;d[19][4]=0.02f;d[19][5]=22.1f*2;d[19][6]=49.5f*2;
	   d[20][1]=0;d[20][2]=-0.11f;d[20][3]=0.22f;d[20][4]=0;d[20][5]=41*2;d[20][6]=48.4f*2;
	    d[21][1]=0;d[21][2]=-0.11f;d[21][3]=0.22f;d[21][4]=0;d[21][5]=52.5f*2;d[21][6]=52.3f*2;
        d[22][1]=0.08f; d[22][2]=0.11f;d[22][3]=-0.25f;d[22][4]=0;d[22][5]=35.7f*2;d[22][6]=49.9f*2;
		  
        x=10000;
        y=10000;
        j=1;
		   
		for (i = 0; i < 1000; i++) {
			Canvas c = holder.lockCanvas();
			for (int w = 0; w < 300; w++) {
				tempx = x;
				Random random = new Random();
				k = random.nextInt(22) + 1;
				x = d[k][1] * tempx + d[k][2] * y + d[k][5];
				y = d[k][3] * tempx + d[k][4] * y + d[k][6];
				x1 = Math.round(x) * j + 200;
				x1 = x1 * 2;
				y1 = Math.round(y) * j + 200;
				y1 = y1 * 2;

				c.drawPoint(x1, 1100 - y1, p);
			}
			holder.unlockCanvasAndPost(c);
		}
	}
}
