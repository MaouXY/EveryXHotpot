# Changelog

## 2026-07-09 - Fork version 2.0.6-1.21Neo-MaouXY.1

- Changed the fork build version from upstream `2.0.5-1.21Neo-TeaCon2024` to `2.0.6-1.21Neo-MaouXY.1`.
- Forced Gradle resource filtering to UTF-8 so `META-INF/neoforge.mods.toml` remains valid UTF-8 after property expansion.
- Fixed NeoForge rejecting the built jar as "not a valid mod file" when TOML parsing failed with `MalformedInputException`.

## 2026-07-09 - Dedicated server client class loading fix

- Fixed a dedicated server crash caused by `HotpotModEntry` exposing client-only renderer classes to common class scanning.
- Moved client-only registry registration into `HotpotClientRegistries`.
- Kept the common mod entry free of direct `com.github.argon4w.hotpot.client.*` imports and client-only static fields.
- Moved the custom item renderer and soup renderer config manager holders to client-side classes.
- Verified with `.\gradlew.bat --no-daemon build --console=plain`.

## License

This fork preserves the upstream MIT License. Source or binary redistribution should include the original `LICENSE` file and copyright notice.
