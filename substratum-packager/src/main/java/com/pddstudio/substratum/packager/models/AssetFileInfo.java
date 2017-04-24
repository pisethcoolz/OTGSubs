package com.pddstudio.substratum.packager.models;

import java.io.Serializable;

/**
 * Created by pddstudio on 24/04/2017.
 */

public class AssetFileInfo implements Serializable {

	private AssetsType type;
	private String     fileLocation;
	private String     fileName;

	public AssetFileInfo(AssetsType type, String fileLocation, String fileName) {
		this.type = type;
		this.fileLocation = fileLocation;
		this.fileName = fileName;
	}

	public AssetsType getType() {
		return type;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public String getFileName() {
		return fileName;
	}
}
