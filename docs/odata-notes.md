# OData Notes

This document explains how the project relates to OData concepts.

The backend currently provides OData-style REST endpoints.

It is not a full SAP OData service, but the API is structured in a way that is similar to entity-based service access.

## Current Backend Endpoint

```text
GET http://localhost:8081/api/odata/materials
```

This endpoint returns a list of material entities.

## Material Entity Example

```json
{
  "id": 1,
  "materialNumber": "MAT-1001",
  "name": "Laptop Lenovo ThinkPad",
  "unit": "STK",
  "currentStock": 3,
  "minimumStock": 3
}
```

## OData-Style Idea

In a real SAP OData service, materials could be exposed as an entity set:

```text
/Materials
```

Possible operations:

```text
GET    /Materials
GET    /Materials(1)
POST   /Materials
PATCH  /Materials(1)
DELETE /Materials(1)
```

## Relation to SAP UI5

The SAP UI5 frontend consumes backend data and displays it in a material stock table.

In productive SAP scenarios, SAP UI5 / Fiori applications often consume OData services.

## Job Advertisement Relevance

This project demonstrates basic understanding of:

- Entity-based API design
- Frontend-backend communication
- SAP UI5 consuming backend data
- OData-related service thinking