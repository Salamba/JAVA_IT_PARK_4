package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.xml.soap.Node;
import java.security.Key;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		BinTree tree = new BinTree(3);
		tree.add(tree.root,5);
		tree.add(tree.root,7);
		tree.add(tree.root,3);
		tree.add(tree.root,1);
		tree.add(tree.root,9);
		tree.add(tree.root,2);
		tree.beginPrefix();
		tree.beginInFix();
		tree.beginPostFix();

	}
}
