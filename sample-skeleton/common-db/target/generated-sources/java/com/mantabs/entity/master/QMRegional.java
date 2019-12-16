package com.mantabs.entity.master;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMRegional is a Querydsl query type for MRegional
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMRegional extends EntityPathBase<MRegional> {

    private static final long serialVersionUID = 631722792L;

    public static final QMRegional mRegional = new QMRegional("mRegional");

    public final StringPath creBy = createString("creBy");

    public final DateTimePath<java.util.Date> creDate = createDateTime("creDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final StringPath idKaryawan = createString("idKaryawan");

    public final StringPath idRegional = createString("idRegional");

    public final StringPath idWilayah = createString("idWilayah");

    public final NumberPath<Integer> isActive = createNumber("isActive", Integer.class);

    public final StringPath modBy = createString("modBy");

    public final DateTimePath<java.util.Date> modDate = createDateTime("modDate", java.util.Date.class);

    public final StringPath namaRegional = createString("namaRegional");

    public final StringPath picRegMkt = createString("picRegMkt");

    public final StringPath picRegOpt = createString("picRegOpt");

    public QMRegional(String variable) {
        super(MRegional.class, forVariable(variable));
    }

    public QMRegional(Path<? extends MRegional> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMRegional(PathMetadata metadata) {
        super(MRegional.class, metadata);
    }

}

