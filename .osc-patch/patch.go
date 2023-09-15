diff --git a/loader_snapshot.go b/home/outscale/go/pkg/mod/github.com/hashicorp/terraform-plugin-sdk@v1.17.2/internal/configs/configload/loader_snapshot.go
index 0772edc..d09a03c 100644
--- a/loader_snapshot.go
+++ b/home/outscale/go/pkg/mod/github.com/hashicorp/terraform-plugin-sdk@v1.17.2/internal/configs/configload/loader_snapshot.go
@@ -47,21 +47,6 @@ func (l *Loader) LoadConfigWithSnapshot(rootDir string) (*configs.Config, *Snaps
 // underlying parser does not have access to other files in the native
 // filesystem, such as values files. For those, either use a normal loader
 // (created by NewLoader) or use the configs.Parser API directly.
-func NewLoaderFromSnapshot(snap *Snapshot) *Loader {
-	fs := snapshotFS{snap}
-	parser := configs.NewParser(fs)
-
-	ret := &Loader{
-		parser: parser,
-		modules: moduleMgr{
-			FS:         afero.Afero{Fs: fs},
-			CanInstall: false,
-			manifest:   snap.moduleManifest(),
-		},
-	}
-
-	return ret
-}
 
 // Snapshot is an in-memory representation of the source files from a
 // configuration, which can be used as an alternative configurations source
@@ -197,7 +182,6 @@ type snapshotFS struct {
 	snap *Snapshot
 }
 
-var _ afero.Fs = snapshotFS{}
 
 func (fs snapshotFS) Create(name string) (afero.File, error) {
 	return nil, fmt.Errorf("cannot create file inside configuration snapshot")
