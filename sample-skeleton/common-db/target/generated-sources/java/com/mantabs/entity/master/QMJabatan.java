package com.mantabs.entity.master;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMJabatan is a Querydsl query type for MJabatan
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMJabatan extends EntityPathBase<MJabatan> {

    private static final long serialVersionUID = -1934220798L;

    public static final QMJabatan mJabatan = new QMJabatan("mJabatan");

    public final StringPath creBy = createString("creBy");

    public final DateTimePath<java.util.Date> creDate = createDateTime("creDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final StringPath idJabatan = createString("idJabatan");

    public final StringPath modBy = createString("modBy");

    public final DateTimePath<java.util.Date> modDate = createDateTime("modDate", java.util.Date.class);

    public final StringPath namaJabatan = createString("namaJabatan");

    public final StringPath status = createString("status");

    public QMJabatan(String variable) {
        super(MJabatan.class, forVariable(variable));
    }

    public QMJabatan(Path<? extends MJabatan> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMJabatan(PathMetadata metadata) {
        super(MJabatan.class, metadata);
    }

}

