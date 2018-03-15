package com.baidu.disconf.client.config;

/**
 * @author yebin
 *
 */
public class DisFileConfig {

	public String env;
	public String app;
	public String version;
	public String filename;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "DisFileConfig [env=" + env + ", app=" + app + ", version=" + version + ", filename=" + filename + "]";
	}

}
