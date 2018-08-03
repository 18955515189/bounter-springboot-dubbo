package cn.bounter.dubbo.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Bounter!!!
 * @author simon
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bounter implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	
	private Date createTime;

	private Long createBy;

    public Long getId() {
        return id;
    }

    public Bounter setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Bounter setName(String name) {
        this.name = name;
        return this;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    public Bounter setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public Bounter setCreateBy(Long createBy) {
        this.createBy = createBy;
        return this;
    }
}
