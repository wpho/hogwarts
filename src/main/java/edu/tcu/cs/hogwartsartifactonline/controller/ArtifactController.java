package edu.tcu.cs.hogwartsartifactonline.controller;

import edu.tcu.cs.hogwartsartifactonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactonline.domain.Result;
import edu.tcu.cs.hogwartsartifactonline.domain.StatusCode;
import edu.tcu.cs.hogwartsartifactonline.service.ArtifactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequestMapping("/artifacts")
public class ArtifactController {

    private ArtifactService artifactService;

    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }

    @GetMapping("/artifacts")
    public Result findAll() {
        List<Artifact> all = artifactService.findAll();
        Result result = new Result(true, StatusCode.SUCCESS, "Find All Success", all);
        return result;
    }

    @GetMapping("/artifacts/{artifactId}")
    public Result findById(@PathVariable String artifactId) {
        return new Result (true, StatusCode.SUCCESS, "Find One Success", artifactService.findById(artifactId));
    }

    @PostMapping("/artifacts")
    public Result save(@RequestBody Artifact newArtifact) {
        artifactService.save(newArtifact);
        return new Result(true, StatusCode.SUCCESS, "Save Success");
    }

    @PutMapping("/artifacts/{artifactId}")
    public Result update(@PathVariable String artifactId, @RequestBody Artifact updatedArtifact) {
        artifactService.update(artifactId, updatedArtifact);
        return new Result(true, StatusCode.SUCCESS, "Update Success");
    }

    @DeleteMapping("/artifacts/{artifactId}")
    public Result delete(@PathVariable String artifactId) {
        artifactService.delete(artifactId);
        return new Result(true, StatusCode.SUCCESS, "Delete Success");

    }
}
