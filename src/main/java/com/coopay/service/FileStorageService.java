package com.coopay.service;

import org.springframework.core.io.Resource;

import org.springframework.web.multipart.MultipartFile;
import java.util.stream.Stream;
import java.nio.file.Path;

public interface FileStorageService {
	public void init();

	  public void save(MultipartFile file);

	  public Resource load(String filename);

	  public void deleteAll();

	  public Stream<Path> loadAll();

}
