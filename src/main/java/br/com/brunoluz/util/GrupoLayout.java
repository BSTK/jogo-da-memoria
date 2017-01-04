package br.com.brunoluz.util;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;

public class GrupoLayout {

	/**
	 * criarParallelGroup
	 * @param layout
	 * @param addComponent
	 * @return
	 */
	public static ParallelGroup criarParallelGroup(GroupLayout  layout, Component addComponent) {
		
		return layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(addComponent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
	}
	
}