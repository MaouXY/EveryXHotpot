# Changelog

## 2026-07-09 - Dedicated server client class loading fix

- Fixed a dedicated server crash caused by `HotpotModEntry` exposing client-only renderer classes to common class scanning.
- Moved client-only registry registration into `HotpotClientRegistries`.
- Kept the common mod entry free of direct `com.github.argon4w.hotpot.client.*` imports and client-only static fields.
- Moved the custom item renderer and soup renderer config manager holders to client-side classes.
- Verified with `.\gradlew.bat --no-daemon build --console=plain`.

## License

This fork preserves the upstream MIT License. Source or binary redistribution should include the original `LICENSE` file and copyright notice.
