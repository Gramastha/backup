package com.psl.main;

import java.io.IOException;

import com.psl.files.FileTransfer;

public class Main {

	public static void main(String[] args) {

FileTransfer fts= new FileTransfer();
try {
	fts.copyFiles("in.txt", "out.txt");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
