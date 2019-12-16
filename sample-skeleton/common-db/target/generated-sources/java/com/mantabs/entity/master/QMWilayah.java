package com.mantabs.entity.master;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMWilayah is a Querydsl query type for MWilayah
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMWilayah extends EntityPathBase<MWilayah> {

    private static final long serialVersionUID = 1251665680L;

    public static final QMWilayah mWilayah = new QMWilayah("mWilayah");

    public final StringPath createBy = createString("createBy");

    public final DatePath<java.sql.Date> createDate = createDate("createDate", java.sql.Date.class);

    public final DatePath<java.sql.Date> endDate = createDate("endDate", java.sql.Date.class);

    public final StringPath idKaryawan = createString("idKaryawan");

    public final StringPath idWilayah = createString("idWilayah");

    public final NumberPath<Integer> isActive = createNumber("isActive", Integer.class);

    public final StringPath modBy = createString("modBy");

    public final DatePath<java.sql.Date> modDate = createDate("modDate", java.sql.Date.class);

    public final StringPath namaWilayah = createString("namaWilayah");

    public QMWilayah(String variable) {
        super(MWilayah.class, forVariable(variable));
    }

    public QMWilayah(Path<? extends MWilayah> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMWilayah(PathMetadata metadata) {
        super(MWilayah.class, metadata);
    }

}

