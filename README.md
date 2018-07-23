Prerequisits:

- maven
- jdk
- rlwrap (allows arrow key functinality in jdb)

Instructions:

```
chmod -R 755 dev_scripts/*.sh
./dev_scripts/compile.sh
./dev_scripts/run.sh
```

Debugging:
```
# in one terminal, start process in debug mode
./dev_scripts/run_debug.sh 

# in other terminal, connect debugger
./dev_scripts/start_debugger.sh
```

When debugging starts, load the debugger_init file:
```
> read debugger_init
> cont
```


