package com.jarmak.dbconn.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CSPRChunkCompositeKey implements Serializable {

  private static final long serialVersionUID = 6027480379272439407L;

  private String sessionId;
  private Integer chunkId;
}
