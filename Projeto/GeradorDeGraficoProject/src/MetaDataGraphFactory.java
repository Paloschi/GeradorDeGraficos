
/**
 * *********************************************************************
 * Module: MetaDataGraphFactory.java Author: Paloschi Purpose: Defines the Class
 * MetaDataGraphFactory
 * *********************************************************************
 */

import metaData.MetaDataGraph;
import metaData.MetaDataXLS;
import metaData.MetaDataXML;

/**
 * @pdOid bf59375e-9b1f-42d0-8f67-8f7ff82075b1
 */
public class MetaDataGraphFactory {

    /**
     * @pdOid 9fe67506-d11d-4ada-97d7-d0ac3294d865
     */
    public static final String MD_XML = "XML";
    /**
     * @pdOid 3028419b-72e5-48cc-88a2-b905b8a56b76
     */
    public static final String MD_XLS = "XLS";

    /**
     * @pdOid 6c3f25a5-184e-4e1a-af36-7d69500fa956
     */
    public MetaDataGraph build(String type_metaData) {

        switch(type_metaData)
        {
            case MD_XML :
                return new MetaDataXML();
            case MD_XLS :
                return new MetaDataXLS();
            default:
                throw new UnsupportedOperationException("Tipo de MetaData não suportado!");
        }

    }
}