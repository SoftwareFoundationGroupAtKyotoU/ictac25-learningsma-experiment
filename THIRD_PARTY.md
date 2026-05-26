# Third-Party Dependencies

This project bundles two pre-built JAR files that are developed and maintained by third parties. Below is detailed information about each.

## Bundled JARs

### 1. models-1.0.jar

| Field | Value |
|---|---|
| **File** | `lib/models-1.0.jar` |
| **Source repository** | [lorisdanto/symbolicautomata](https://github.com/lorisdanto/symbolicautomata) (models module) |
| **Version** | 1.0 |
| **License** | Apache-2.0 |
| **Modified** | No |
| **Rebuild command** | `git clone https://github.com/lorisdanto/symbolicautomata && cd symbolicautomata && git submodule update --init && cd models && mvn package` |

### 2. learningsma-1.0-SNAPSHOT.jar

| Field | Value |
|---|---|
| **File** | `lib/learningsma-1.0-SNAPSHOT.jar` |
| **Source repository** | [SoftwareFoundationGroupAtKyotoU/learningsma](https://github.com/SoftwareFoundationGroupAtKyotoU/learningsma) |
| **Version** | 1.0-SNAPSHOT |
| **License** | Apache-2.0 |
| **Modified** | No |
| **Rebuild command** | Follow instructions in [`README.md`](./README.md) under "Rebuilding learningsma-1.0-SNAPSHOT.jar" |

### Summary

| JAR | License | Modified? |
|---|---|---|
| `models-1.0.jar` | Apache-2.0 | No |
| `learningsma-1.0-SNAPSHOT.jar` | Apache-2.0 | No |
