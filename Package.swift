// swift-tools-version:5.3
import PackageDescription

let version = "1.0.0"
let moduleName = "Api"
let checksum = "96af12badd937facc56058384ab07f9127f91ef17b33fa728e106419caacb2e2"

let package = Package(
    name: moduleName,
    platforms: [
		.iOS(.v16)
    ],
    products: [
        .library(
            name: moduleName,
            targets: [moduleName]
        )
    ],
    targets: [
        .binaryTarget(
            name: moduleName,
            url: "https://github.com/trashcan-xyz/kotlin-mobile-api/raw/main/package/shared.framework",
        )
    ]
)