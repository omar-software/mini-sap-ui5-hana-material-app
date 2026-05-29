\# CDS View Examples



This document contains simplified CDS View ideas related to the Mini SAP UI5 HANA Material App.



These examples are learning notes and are not executed in this local project.



\## Material Stock View



```sql

@AbapCatalog.sqlViewName: 'ZMATSTOCK'

@EndUserText.label: 'Material Stock Overview'

define view Z\_MaterialStockView

&#x20; as select from materials

{

&#x20; key id              as MaterialId,

&#x20;     material\_number as MaterialNumber,

&#x20;     name            as MaterialName,

&#x20;     unit            as Unit,

&#x20;     current\_stock   as CurrentStock,

&#x20;     minimum\_stock   as MinimumStock

}

```



\## Low Stock View



```sql

@AbapCatalog.sqlViewName: 'ZLOWSTOCK'

@EndUserText.label: 'Low Stock Materials'

define view Z\_LowStockMaterials

&#x20; as select from materials

{

&#x20; key id              as MaterialId,

&#x20;     material\_number as MaterialNumber,

&#x20;     name            as MaterialName,

&#x20;     unit            as Unit,

&#x20;     current\_stock   as CurrentStock,

&#x20;     minimum\_stock   as MinimumStock

}

where current\_stock <= minimum\_stock

```



\## Purpose



CDS Views are used in SAP environments to define reusable data models and views.



\## Job Advertisement Relevance



This document relates to:



\- CDS Views

\- SAP data modeling

\- Material stock overview

\- Low-stock reporting

