package com.mantabs.collection.master.area_assignment.view;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPortofolioViewHDR is a Querydsl query type for PortofolioViewHDR
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPortofolioViewHDR extends EntityPathBase<PortofolioViewHDR> {

    private static final long serialVersionUID = 1317651323L;

    public static final QPortofolioViewHDR portofolioViewHDR = new QPortofolioViewHDR("portofolioViewHDR");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDt = createDateTime("createdDt", java.util.Date.class);

    public final StringPath idCabang = createString("idCabang");

    public final StringPath idCentro = createString("idCentro");

    public final StringPath idKaryawan = createString("idKaryawan");

    public final StringPath idRegional = createString("idRegional");

    public final StringPath idWilayah = createString("idWilayah");

    public final StringPath jabatan = createString("jabatan");

    public final StringPath modifiedBy = createString("modifiedBy");

    public final DateTimePath<java.util.Date> modifiedDt = createDateTime("modifiedDt", java.util.Date.class);

    public final StringPath namaCabang = createString("namaCabang");

    public final StringPath namaCentro = createString("namaCentro");

    public final StringPath namaKaryawan = createString("namaKaryawan");

    public final StringPath namaRegional = createString("namaRegional");

    public final StringPath namaWilayah = createString("namaWilayah");

    public final StringPath status = createString("status");

    public QPortofolioViewHDR(String variable) {
        super(PortofolioViewHDR.class, forVariable(variable));
    }

    public QPortofolioViewHDR(Path<? extends PortofolioViewHDR> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPortofolioViewHDR(PathMetadata metadata) {
        super(PortofolioViewHDR.class, metadata);
    }

}

