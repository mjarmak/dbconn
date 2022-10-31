package com.jarmak.dbconn.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@IdClass(CSPRChunkCompositeKey.class)
@Table(name = "TBL_CSPR_CHUNK")
@Data
public class CSPRChunk implements Serializable {

	private static final long serialVersionUID = 4484666001484836744L;

	@Id
	@Column(name = "FK_TID_SESSION", unique = true, nullable = false)
	private String sessionId;

	@Id
	@Column(name = "TID_CHUNK", unique = true, nullable = false)
	private Integer chunkId;

	@Column(name = "CHUNK_SIZE")
	private Long chunkSize;

	@Column(name = "RECEIVEDATE")
	private Timestamp receiveDate;
}
